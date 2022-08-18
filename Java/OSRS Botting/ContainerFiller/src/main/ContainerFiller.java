package main;

import org.dreambot.api.wrappers.interactive.GameObject;
import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.wrappers.items.Item;
import org.dreambot.api.wrappers.widgets.message.Message;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.input.Camera;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Timer;
import org.dreambot.api.script.Category;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import enums.Location;

import gui.Menu;

@ScriptManifest(author = "testabcdef", name = "Container Filler", version = 1.0, description = "Fills Bowls, Jugs, Vials, & Jugs", category = Category.MONEYMAKING)

public class ContainerFiller extends AbstractScript {

	private Menu gui;
	private String status;
	private Timer timeElasped;
	private Location location;
	private String containerType;
	private int containersFilled;
	
	@Override
	public void onStart() {
		log("S.T.A.R.T.I.N.G");
		handleMenu();
		timeElasped = new Timer();
	}

	@Override
	public int onLoop() {
				
		if (location.getBank().contains(getLocalPlayer())) {
			if (getInventory().onlyContains(containerType)) {
				walkTo(location.getFountain());
			} else {
				fixInventory();
			}
		} else {
			if (!location.getBank().contains(getLocalPlayer()) && onlyEmptyContainers()) {
				walkTo(location.getFountain());
			}
		}
		
		if (location.getFountain().contains(getLocalPlayer())) {
			if (getInventory().contains(containerType)) {
				fillContainer();	
			} else {
				walkTo(location.getBank());
			}
		} else {
			if (!location.getFountain().contains(getLocalPlayer()) && !location.getBank().contains(getLocalPlayer()) && !onlyEmptyContainers()) {
				walkTo(location.getBank());
			}
		}
		
		return Calculations.random(500, 2000);
	}
	
	private void fixInventory() {
		if (getBank().isOpen()) {
			if (!getInventory().isEmpty()) {
				if (getBank().depositAllExcept(containerType)) {
					status = "Emptying Inventory";
					sleepUntil (() -> onlyEmptyContainers(), 3500);
				}
			} else {
				if (getBank().count(containerType) > 1) {
					if (getBank().withdrawAll(containerType)) {
						status = "Withdrawing " + containerType;
						sleepUntil(() -> onlyEmptyContainers(), 3500);
					}
				} else {
					stop();
				}
			}
		} else openBank();
	}
	
	private void fillContainer() {
		status = "Filling Containers";
		GameObject fountain = getGameObjects().closest("Fountain");
		Item container = getInventory().get(containerType);
		if (container != null) {
			if (container.interact()) {
				sleepUntil(() -> getInventory().isItemSelected(), 2000);
				if (fountain != null) {
					if (fountain.isOnScreen()) {
						if (fountain.interactForceRight("Use")) {
							sleepUntil(() -> !getInventory().contains(containerType), 20000);
							containersFilled += getInventory().count(containerType + " of water");
						}
					} else {
						status = "Moving Camera";
						Camera moveCamera = getCamera();
						moveCamera.mouseRotateToEntity(fountain);
					}
				} else {
					walkTo(location.getFountain());
				}
			}
		} else {
			walkTo(location.getBank());
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
	
	private boolean onlyEmptyContainers() {
		if (getInventory().onlyContains(containerType)) {
			return true;
		} else {
			return false;
		}
	}
	
	private void walkTo(Area area) {
		status = "Walking To Area";
		if (getWalking().walk(area.getRandomTile())) {
			sleepUntil(() -> area.contains(getLocalPlayer()), 2400);
		}
	}
	
	@Override
	public void onPaint(Graphics g) {
		
		g.setColor(Color.black);
		g.setColor(new Color(0, 0, 0, 150));
		g.fillRect(7, 345, 506, 130);

		Font font = new Font("Times New Roman", Font.BOLD, 22);
		g.setFont(font);

		g.setColor(Color.white);
		g.drawString("Container Filler | By testabcdef | v" + getVersion(), 17, 374);

		font = new Font("Arial", Font.PLAIN, 12);
		g.setFont(font);

		g.drawString("Time Ran: " + timeElasped.formatTime().toString(), 20, 398);
		g.drawString("Status: " + status, 140, 398);
		g.drawString("Location: " + location.toString(), 315, 398);
		
		g.drawString("Container: " + containerType, 20, 418);
		g.drawString("" + containerType + " Filled: " + containersFilled, 140, 418);
		g.drawString("Hourly Rate: " + (containersFilled * 3600000) / timeElasped.elapsed(), 315, 418);

		font = new Font("Arial", Font.BOLD, 16);
		g.setFont(font);

		g.drawString("Please Report All Bugs To Me On DreamBot | Feel Free To PM Me ", 10, 330);
	}

	@Override
	public void onMessage (Message m) { }	

	@Override
	public void onExit() { log("S.T.O.P.P.I.N.G"); }
	
	private void handleMenu() {
		gui = new Menu(this);
		gui.setVisible(true);
		while (gui.isVisible()) {
			sleep(1000);
		}
	}
		
	public void setLocation(Location location) 
	{ this.location = location; }
	
	public void setContainerType(String containerType) 
	{ this.containerType = containerType; }
}
