package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

//import org.dreambot.api.methods.container.impl.bank.BankMode;
//import org.dreambot.api.methods.grandexchange.GrandExchange;
//import org.dreambot.api.data.GameState;
//import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.input.Camera;
import org.dreambot.api.methods.tabs.Tab;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Timer;
import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.wrappers.items.Item;
import org.dreambot.api.wrappers.widgets.*;
import org.dreambot.api.wrappers.widgets.message.Message;

import enums.PubLocation;
import gui.Menu;

@ScriptManifest(author = "testabcdef", name = "iBuyBeer", version = 1.1, description = "Buys Beers At Varrock Pubs", category = Category.MONEYMAKING)

public class Beer extends AbstractScript {

	private byte ea;
	private Menu menu;
	private int boozeCount;
	private Timer timeElasped;
	public PubLocation pubLocation;
	private String status = "Waiting For User Input";

	@Override
	public void onStart() {
		waitForUserInput();
		log("S.T.A.R.T.I.N.G");
		timeElasped = new Timer();
		ea = (byte) menu.getEndingAction();
	}

	@Override
	public int onLoop() {
		
		if (pubLocation.getBankLoc().contains(getLocalPlayer())) {
			
			checkInventory();
			checkCoins();
			
			if (shouldWalk()) {
				walkToPub();
			} else {
				checkCoins();
			}
		} else {
			if (!pubLocation.getBankLoc().contains(getLocalPlayer()) && shouldWalk()) {
				walkToPub();
			} else {
				walkToBank();
			}
		}

		if (pubLocation.getPubLoc().contains(getLocalPlayer())) {
			if (shouldBuy()) {
				buyBeers();
			} else {
				walkToBank();
			}
		} else {
			if (!pubLocation.getPubLoc().contains(getLocalPlayer()) && shouldBuy()) {
				walkToPub();
			}
		}

		return Calculations.random(1500, 2000);
	}

	private void checkInventory() {
		if (!getInventory().contains("Coins") && !getInventory().contains("Beer")) {
			depositAllStuff();
		} else if (getInventory().contains("Beer")) {
			depositAll("Beer");
		}
	}

	private void checkCoins() {
		if (getInventory().count("Coins") >= 2 && !getInventory().isFull()) {
			if (getBank().isOpen()) {
				status = "Closing Bank";
				if (getBank().close()) {
					sleepUntil(() -> !getBank().isOpen(), 1500);
				}
			}
		} else {
			openBank();
			withdrawAll("Coins");
		}
	}
	
	private boolean shouldWalk() {
		if (getInventory().count("Coins") >= 2 && !getInventory().isFull()) {
			return true;
		} else {
			checkInventory();
			return false;
		}
	}

	private boolean shouldBuy() {
		if (getInventory().count("Coins") >= 2 && !getInventory().isFull()) {
			return true;
		} else {
			return false;
		}
	}

	private void buyBeers() {
		status = "Buying Quality Booze";
		NPC bartender = getNpcs().closest("Bartender");
		if (bartender != null) {
			if (bartender.interact("Talk-to")) {
				sleep(Calculations.random(1000, 2000));
				if (getDialogues().inDialogue()) {
					for (int i = 0; i < 6; i++) {
						sleep(Calculations.random(500, 1000));
						if (i != 2) {
							getDialogues().spaceToContinue();
						} else {
							getKeyboard().type("1");
						}
					}
				}
			}
		}
	}

	private void openBank() {
		status = "Opening The Bank";
		NPC banker = getNpcs().closest(npc -> npc != null && npc.hasAction("Bank"));
		if (banker != null) {
			if (!banker.isOnScreen()) {
				Camera moveCamera = getCamera();
				moveCamera.mouseRotateToEntity(banker);
			} else {
				if (banker.interact("Bank")) {
					sleepUntil(() -> getBank().isOpen(), 2000);
				}
			}
		}
	}

	private void depositAllStuff() {
		status = "Depositing Everything";
		if (getBank().isOpen()) {
			if (getBank().depositAllItems()) {
				sleepUntil(() -> getInventory().isEmpty(), 2500);
			}
		} else {
			openBank();
		}
	}

	private void depositAll(String item) {
		status = "Depositing Beers";
		if (getBank().isOpen()) {
			if (getBank().depositAll(item)) {
				sleepUntil(() -> !getInventory().contains(item), 3000);
			}
		} else {
			openBank();
		}
	}

	private void withdrawAll(String item) {
		status = "Withdrawing Coins";
		Item i = getBank().get(item);
		if (getBank().isOpen()) {
			if (i != null && getBank().count(item) >= 1) {
				if (getBank().withdrawAll(item)) {
					sleepUntil(() -> getInventory().contains(item) && getInventory().count(item) > 1, 3000);
				}
			} else {
				endingAction();
			}
		} else {
			openBank();
		}
	}

	private void walkToBank() {
		status = "Laughing To The Bank";
		if (!pubLocation.getBankLoc().contains(getLocalPlayer())) {
			if (getWalking().walk(pubLocation.getBankLoc().getRandomTile())) {
				sleep(Calculations.random(1000, 3000));
			}
		}
	}

	private void walkToPub() {
		status = "Walking To The Club";
		if (!pubLocation.getPubLoc().contains(getLocalPlayer())) {
			if (getWalking().walk(pubLocation.getPubLoc().getRandomTile())) {
				sleep(Calculations.random(1000, 3000));
			}
		}
	}
	
	private void endingAction() {

		if (ea == 0) {
			status = "Stopping Script";
			stop();
		}

		if (ea == 1) {
			status = "Logging Out Safely";
			if (getLocalPlayer().isInCombat() || getLocalPlayer().isHealthBarVisible()) {
				walkToBank();
			} else {
				if (getBank().isOpen()) {
					if (getBank().close()) {
						sleepUntil(() -> !getBank().isOpen(), 2000);
					}
				}
				if (!getTabs().isOpen(Tab.LOGOUT)) {
					if (getTabs().open(Tab.LOGOUT)) {
						WidgetChild logout = getWidgets().getWidgetChild(182, 6);
						if (logout != null) {
							if (logout.interact()) {
								sleepUntil(() -> !logout.isVisible(), 5000);
								stop();
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void onExit() {
		log("S.T.O.P.P.I.N.G");
	}

	@Override
	public void onPaint(Graphics g) {

		g.setColor(Color.black);
		g.setColor(new Color(0, 0, 0, 150));
		g.fillRect(7, 345, 506, 130);

		Font font = new Font("Times New Roman", Font.BOLD, 22);
		g.setFont(font);

		g.setColor(Color.white);
		g.drawString("Beer/Ale Buyer | By testabcdef | v" + getVersion(), 17, 374);

		font = new Font("Arial", Font.PLAIN, 12);
		g.setFont(font);

		g.drawString("Time Ran: " + timeElasped.formatTime().toString(), 20, 398);
		g.drawString("Status: " + status, 140, 398);
		g.drawString("Pub/Bank Location: " + pubLocation.getScapelocation().toString(), 315, 398);

		g.drawString("Beers Stolen: " + boozeCount, 20, 418);
		g.drawString("Booze Per Hour: " + ((boozeCount * 3600000) / timeElasped.elapsed()), 140, 418);

		font = new Font("Arial", Font.BOLD, 16);
		g.setFont(font);

		g.drawString("Please Report All Bugs To Me On DreamBot | Feel Free To PM Me ", 10, 330);
	}

	@Override
	public void onMessage(Message m) {
		if (m.getMessage().contains("You buy a pint")) {
			boozeCount++;
		}
	}

	private void waitForUserInput() {
		menu = new Menu(this);
		menu.setVisible(true);
		while (menu.isVisible()) {
			sleep(1000);
		}
	}
}
