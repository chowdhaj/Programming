package main;

import org.dreambot.api.wrappers.interactive.GameObject;
import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.wrappers.items.Item;
import org.dreambot.api.wrappers.widgets.message.Message;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.input.Camera;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.methods.widget.Widget;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Timer;
import org.dreambot.api.script.Category;
import org.dreambot.api.wrappers.widgets.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

@ScriptManifest(author = "testabcdef", name = "Basic Balls", version = 1.0, description = "Makes Cannonballs At Edgeville", category = Category.SMITHING)

public class Balls extends AbstractScript {

	private Timer timeElasped;
	private String currentStatus = "Doing Nothing";
	Area bankArea = new Area(3091, 3499, 3098, 3496);
	Area furnaceArea = new Area(3105, 3501, 3110, 3496);
	Tile smeltTile = new Tile(3109, 3499);

	public enum State {
		SMITH, BANK, WALK_TO_BANK, WALK_TO_FURNACE, LOGOUT, WAIT;
	}

	public State getState() {

		if (getLocalPlayer().getTile().equals(smeltTile) && getLocalPlayer().isAnimating())
			return State.WAIT;
		if (bankArea.contains(getLocalPlayer()) && getInventory().contains("Steel bar"))
			return State.WALK_TO_FURNACE;
		if (bankArea.contains(getLocalPlayer()) && (getInventory().contains("Cannonball") || !getInventory().isFull()))
			return State.BANK;
		if (furnaceArea.contains(getLocalPlayer()) && getInventory().contains("Steel bar"))
			return State.SMITH;
		if (furnaceArea.contains(getLocalPlayer()) && !getInventory().contains("Steel bar"))
			return State.WALK_TO_BANK;
		if (!getInventory().contains("Ammo mould"))
			return State.LOGOUT;

		return State.WALK_TO_BANK;
	}

	@Override
	public void onStart() {
		log("STARTING...");
		timeElasped = new Timer();
	}

	@Override
	public void onMessage(Message m) {
	}

	@Override
	public int onLoop() {

		switch (getState()) {

		case SMITH:
			currentStatus = "Making Cannonballs";
			GameObject furnace = getGameObjects().closest("Furnace");
			Item steelBar = getInventory().get("Steel bar");
			WidgetChild makeAll = getWidgets().getWidgetChild(309,2);
			if (furnace != null) {
				if (furnace.isOnScreen()) {

					/*
					if (steelBar != null && steelBar.interact("Use")) {
						sleep(Calculations.random(100, 800));
						if (furnace.interact()) {
							if (getWidgets().getWidgetChild(162,30) != null) {
								getWidgets().getWidgetChild(162,30).interact("Make all");
							}
							sleepUntil(() -> !getInventory().contains("Steel bar"), 30000);
						}
					}
					*/
					
					
					
				} else {
					Camera moveCamera = getCamera();
					moveCamera.mouseRotateToEntity(furnace);
				}
			}
			break;

		case BANK:
			currentStatus = "Depositing Cannonballs";
			if (getInventory().contains("Cannonball") || !getInventory().isFull()) {
				NPC banker = getNpcs().closest(npc -> npc != null && npc.hasAction("Bank"));
				if (banker != null) {
					if (!banker.isOnScreen()) {
						Camera moveCamera = getCamera();
						moveCamera.mouseRotateToEntity(banker);
					} else {
						if (banker.interact("Bank")) {
							if (sleepUntil(() -> getBank().isOpen(), 5000)) {
								if (getBank().depositAll("Cannonball"))
									sleepUntil(() -> !getInventory().contains("Cannonball"), 4000);
							}
						}
					}
				}
			}
			if (getBank().isOpen() && !getInventory().isFull()) {
				if (getBank().withdrawAll("Steel bar")) {
					sleepUntil(() -> getInventory().contains("Steel bar"), 4000);
				} else if (!getBank().contains("Steel bar")) {
					log("We have run out of Steel bars; stopping script!");
					stop();
				}
			}
			break;

		case WALK_TO_BANK:
			currentStatus = "Walking To Bank";
			if (getWalking().walk(bankArea.getRandomTile()))
				sleepUntil(() -> bankArea.contains(getLocalPlayer()), 15000);
			break;

		case WALK_TO_FURNACE:
			currentStatus = "Walking To Furnace";
			if (getWalking().walk(furnaceArea.getRandomTile()))
				sleepUntil(() -> furnaceArea.contains(getLocalPlayer()), 15000);
			break;

		case WAIT:
			sleep(Calculations.random(5000, 10000));
			break;

		case LOGOUT:
			stop();
			break;

		}

		return Calculations.random(500, 2000);
	}

	@Override
	public void onExit() {
		log("STOPPING...");
	}

	@Override
	public void onPaint(Graphics g) {
		/*
		g.setColor(Color.black);
		g.setColor(new Color(0, 0, 0, 150));
		g.fillRect(7, 345, 506, 130);

		Font font = new Font("Times New Roman", Font.BOLD, 22);
		g.setFont(font);

		g.setColor(Color.white);
		g.drawString("Basic Cannonballs | By testabcdef | v" + getVersion(), 17, 374);

		font = new Font("Arial", Font.PLAIN, 12);
		g.setFont(font);

		g.drawString("Time Ran: " + timeElasped.formatTime().toString(), 20, 397);
		g.drawString("Status: " + currentStatus, 140, 397);

		g.drawString("Balls Made: ", 20, 420);
		g.drawString("Per Hour: : ", 140, 420);

		g.drawString("Smithing Level: ", 20, 442);
		g.drawString("Gained: ", 140, 442);

		g.drawString("XP Gained: ", 20, 464);
		g.drawString("Per Hour: ", 140, 464);
		g.drawString("Time TNL: ", 260, 464);

		font = new Font("Arial", Font.BOLD, 16);
		g.setFont(font);

		g.drawString("Please Report All Bugs To Me On DreamBot | Feel Free To PM Me ", 10, 330);
	*/
	}
}
