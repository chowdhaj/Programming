package main;

import org.dreambot.api.wrappers.items.GroundItem;
import org.dreambot.api.wrappers.interactive.NPC;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.input.Camera;
import org.dreambot.api.methods.skills.Skill;
import org.dreambot.api.methods.map.Area;
import org.dreambot.api.utilities.Timer;
import org.dreambot.api.script.Category;

import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;

@ScriptManifest(author = "testabcdef", name = "WizKill", version = 1.0, description = "Kills Elemental Wizards", category = Category.COMBAT)
public class WizKill extends AbstractScript {

	Menu gui = new Menu();
	private Timer timeElasped;
	private int foodDrawAmount;
	private String[] lootConvertedToArray;
	private Area bankArea = new Area(3009, 3358, 3015, 3355);
	private Area fightArea = new Area(2984, 3276, 3006, 3261);
	private String currentStatus = "Doing Nothing", foodSelected;
	private String[] elementalWizards = { "Air wizard", "Earth wizard", "Fire wizard", "Water wizard" };
	private ArrayList<String> lootFromWizards = new ArrayList<String>();	
	
	private enum State { ATTACK, BANK, DEPOSIT, WITHDRAW, WIZARDS, LOGOUT, EAT, LOOT; }

	private State getState() {
		
		if (shouldEat()) return State.EAT;
				
		if (fightArea.contains(getLocalPlayer()) && canLoot()) { 
			GroundItem totalLoot = getGroundItems().closest(lootConvertedToArray);
			if (totalLoot != null && totalLoot.exists() && getMap().canReach(totalLoot)) return State.LOOT;
		}
		
		if (fightArea.contains(getLocalPlayer()) && getInventory().contains(foodSelected)) return State.ATTACK;
						
		if ((fightArea.contains(getLocalPlayer()) && !getInventory().contains(foodSelected))
				|| ((!bankArea.contains(getLocalPlayer()) && !getInventory().contains(foodSelected)))
				|| getInventory().isFull() && !getInventory().contains(foodSelected)) return State.BANK;
		
		if (!getBank().isOpen() && bankArea.contains(getLocalPlayer()) && !getInventory().contains(foodSelected)) return State.DEPOSIT;
		
		if (getBank().isOpen() && !getInventory().isFull()) return State.WITHDRAW;
	
		if ((bankArea.contains(getLocalPlayer()) && getInventory().contains(foodSelected))
				|| (!fightArea.contains(getLocalPlayer()) && getInventory().contains(foodSelected))) return State.WIZARDS;
		
		return State.LOGOUT;
	}

	@Override
	public void onStart() {
		log("... S T A R T I N G ...");
		gui.setVisible(true);
		while (!gui.getStartScript()) sleep(1000);
		timeElasped = new Timer();
		foodDrawAmount = calculateAmount();
		foodSelected = gui.getFoodType();
		if (canLoot()) calculateLoot();
		getSkillTracker().start(Skill.ATTACK);
		getSkillTracker().start(Skill.STRENGTH);
		getSkillTracker().start(Skill.DEFENCE);
		getSkillTracker().start(Skill.HITPOINTS);
	}

	@Override
	public int onLoop() {
		
		if (gui.getStartScript()) {
			
			switch (getState()) {

			case EAT:
				currentStatus = "Eating " + foodSelected;
				if (getInventory().contains(foodSelected) && getInventory().interact(foodSelected, "Eat")) sleep(Calculations.random(1200, 1700));
				break;
				
			case LOOT:
				currentStatus = "Looting Stuff";
				if (!getInventory().isFull()) {
					GroundItem lootStuff = getGroundItems().closest(lootConvertedToArray);
					if (lootStuff != null & lootStuff.interact("Take")) sleepUntil(() -> !lootStuff.exists(), 1200);	
				} else if (getInventory().contains(foodSelected) && getInventory().interact(foodSelected, "Eat")) {
					currentStatus = "Making Space For Loot";
					sleep(Calculations.random(1200, 1700));
				}
				break;

			case ATTACK:
				currentStatus = "Attacking Wizards";
				NPC wizard = getNpcs().closest(elementalWizards); //npc -> npc != null && !npc.isInCombat() && npc.hasAction("Attack") && npc.equals(elementalWizards));
				if (wizard != null && !wizard.isInCombat() && wizard.isOnScreen() && wizard.interact("Attack")) {
					//sleepUntil(() -> !wizard.exists() || getLocalPlayer().isInCombat(), 30000);
					sleepWhile(() -> getLocalPlayer().isInCombat() || wizard.exists(), 60000);
				} else {
					if (!wizard.isOnScreen()) {
						Camera rotateToWizard = getCamera();
						rotateToWizard.rotateToEntity(wizard);
					}
				}
				break;

			case BANK:
				currentStatus = "Walking To Bank";
				if (getWalking().walk(bankArea.getRandomTile())) sleep(Calculations.random(100, 400));
				break;

			case DEPOSIT:
				currentStatus = "Depositing Loot";
				NPC banker = getNpcs().closest(npc -> npc != null && npc.hasAction("Bank"));
				if (!banker.isOnScreen()) { 
					Camera moveCamera = getCamera();
					moveCamera.mouseRotateToEntity(banker);
				}
				if (banker != null && banker.interact("Bank")) {
					if (sleepUntil(() -> getBank().isOpen(), 5000)) {
						if (getBank().depositAllItems()) sleep(Calculations.random(250, 750));
					}
				} 
				break;

			case WITHDRAW:
				currentStatus = "Withdrawing " + foodSelected;
				if (getBank().contains(foodSelected) && getBank().withdraw(foodSelected, foodDrawAmount)) {
					if (getBank().close()) {
						sleepUntil(() -> !getBank().isOpen() && getInventory().contains(foodSelected), 3000);
					}
				} else {
					log("We are out of food, stopping script");
					stop();
				}
				break;

			case WIZARDS:
				currentStatus = "Walking To Wizards";
				if (getWalking().walk(fightArea.getRandomTile())) sleep(Calculations.random(200, 600));
				break;

			case LOGOUT:
				log("ERROR: Logging out");
				stop();
			}
		}
		return Calculations.random(500, 2000);
	}

	@Override
	public void onExit() {
		log("... S T O P P I N G ...");
	}

	@Override
	public void onPaint(Graphics g) {

		if (gui.getStartScript()) {

			g.setColor(Color.black);
			g.setColor(new Color(0, 0, 0, 150));
			g.fillRect(7, 345, 506, 130);

			Font font = new Font("Times New Roman", Font.BOLD, 22);
			g.setFont(font);

			g.setColor(Color.white);
			g.drawString("Elemental Wizard Killer | By testabcdef | v" + getVersion(), 17, 374);

			font = new Font("Arial", Font.PLAIN, 12);
			g.setFont(font);

			g.drawString("Time Ran: " + timeElasped.formatTime().toString(), 20, 398);
			g.drawString("Status: " + currentStatus, 140, 398);
			
			g.drawString("Please Report All Bugs To Me On DreamBot | Feel Free To PM Me | Cheers, testabcdef", 20, 468);

			g.setColor(Color.black);
			g.setColor(new Color(0, 0, 0, 100));
			g.fillRect(3, 275, 513, 15);

			g.setColor(new Color(0, 0, 0, 50));
			g.fillRect(3, 290, 513, 49);

			g.setColor(Color.white);
			font = new Font("Arial", Font.BOLD, 12);
			g.setFont(font);
			g.drawString("Skill", 20, 287);
			g.drawString("XP Gained", 100, 287);
			g.drawString("XP / HR", 220, 287);
			g.drawString("LVLs Gained", 320, 287);
			g.drawString("Time TNL", 422, 287);

			font = new Font("Arial", Font.PLAIN, 9);
			g.setFont(font);

			g.drawString("Attack", 20, 300);
			g.drawString("Strength", 20, 311);
			g.drawString("Defense", 20, 322);
			g.drawString("HitPoints", 20, 333);

			g.drawString("" + getSkillTracker().getGainedExperience(Skill.ATTACK), 100, 300);
			g.drawString("" + getSkillTracker().getGainedExperience(Skill.STRENGTH), 100, 311);
			g.drawString("" + getSkillTracker().getGainedExperience(Skill.DEFENCE), 100, 322);
			g.drawString("" + getSkillTracker().getGainedExperience(Skill.HITPOINTS), 100, 333);

			g.drawString("" + getSkillTracker().getGainedExperiencePerHour(Skill.ATTACK), 220, 300);
			g.drawString("" + getSkillTracker().getGainedExperiencePerHour(Skill.STRENGTH), 220, 311);
			g.drawString("" + getSkillTracker().getGainedExperiencePerHour(Skill.DEFENCE), 220, 322);
			g.drawString("" + getSkillTracker().getGainedExperiencePerHour(Skill.HITPOINTS), 220, 333);

			g.drawString("" + getSkillTracker().getStartLevel(Skill.ATTACK) + " + " + getSkillTracker().getGainedLevels(Skill.ATTACK), 320, 300);
			g.drawString("" + getSkillTracker().getStartLevel(Skill.STRENGTH) + " + " + getSkillTracker().getGainedLevels(Skill.STRENGTH), 320, 311);
			g.drawString("" + getSkillTracker().getStartLevel(Skill.DEFENCE) + " + " + getSkillTracker().getGainedLevels(Skill.DEFENCE), 320, 322);
			g.drawString("" + getSkillTracker().getStartLevel(Skill.HITPOINTS) + " + " + getSkillTracker().getGainedLevels(Skill.HITPOINTS), 320, 333);

			g.drawString("" + formatTime(getSkillTracker().getTimeToLevel(Skill.ATTACK)), 422, 300);
			g.drawString("" + formatTime(getSkillTracker().getTimeToLevel(Skill.STRENGTH)), 422, 311);
			g.drawString("" + formatTime(getSkillTracker().getTimeToLevel(Skill.DEFENCE)), 422, 322);
			g.drawString("" + formatTime(getSkillTracker().getTimeToLevel(Skill.HITPOINTS)), 422, 333);
		}
	}
	
    private final String formatTime(final long ms) {
	    long s = ms / 1000, m = s / 60, h = m / 60;
	    s %= 60; m %= 60; h %= 24;
	    return String.format("%02d:%02d:%02d", h, m, s);
	}

	private boolean canLoot() { 
		return gui.shouldLootRunes() || gui.shouldLootTalies(); 
	}
	
	private int getHealthAsPercent() {
		int drainedHealth = getSkills().getBoostedLevels(Skill.HITPOINTS);
		int totalHealth = getSkills().getRealLevel(Skill.HITPOINTS);
		
		if (drainedHealth > totalHealth) { return 100; } 
		else { return (drainedHealth * 100) / totalHealth; }
	}

	private boolean shouldEat() { 
		return hasFood() && getHealthAsPercent() < 50; 
	}

	private boolean hasFood() {
		return !getInventory().all(i -> i != null && !i.isNoted()
				&& (i.hasAction("Eat") || (i.getName().contains("Wine") && i.hasAction("Drink")))).isEmpty();
	}
	
	private void calculateLoot() {
		if (gui.shouldLootRunes()) {
			lootFromWizards.add("Air rune");
			lootFromWizards.add("Fire rune");
			lootFromWizards.add("Water rune");
			lootFromWizards.add("Earth rune"); 
		}
		
		if (gui.shouldLootTalies()) {
			lootFromWizards.add("Air talisman");
			lootFromWizards.add("Fire talisman");
			lootFromWizards.add("Water talisman");
			lootFromWizards.add("Earth talisman"); 
		}
		
		lootConvertedToArray = lootFromWizards.toArray(new String[lootFromWizards.size()]);
	}
	
	private int calculateAmount() {
		if (gui.shouldLootRunes() && gui.shouldLootTalies()) { return 18; } 
		else if (gui.shouldLootRunes() && !gui.shouldLootTalies()) { return 24; } 
		else if (!gui.shouldLootRunes() && gui.shouldLootTalies()) { return 22; } 
		else { return 28; }
	}
}
