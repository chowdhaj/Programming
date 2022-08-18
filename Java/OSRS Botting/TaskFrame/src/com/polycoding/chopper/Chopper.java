package com.polycoding.chopper;

import org.dreambot.api.wrappers.widgets.message.Message;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.skills.Skill;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.Category;

import java.awt.Graphics;
import java.util.LinkedList;

import com.polycoding.chopper.core.Task;
import com.polycoding.chopper.enums.Presets;
import com.polycoding.chopper.gui.Menu;
import com.polycoding.chopper.tasks.Chop;
import com.polycoding.chopper.tasks.Drop;

@ScriptManifest(author = "testabcdef", name = "Basic PowerChopper", version = 1.0, description = "Cuts Trees", category = Category.WOODCUTTING)

public class Chopper extends AbstractScript {

	private Menu gui;
	private Presets treeType;
	private Chop chop = null;
	private Drop drop = null;
	private LinkedList<Task> taskList = new LinkedList<Task>();

	@Override
	public void onStart() {
		log("STARTING...");
		handleMenu();
		while (gui.isVisible()) {
			sleep(1000);
		}
		checkLevel();
		addTasks();
	}

	@Override
	public int onLoop() {

		for (Task t : taskList) {
			if (t.validate()) {
				t.execute();
			}
		}
		//random return doesn't matter that much
		//however i the wide range
		//suggestion, get a number from a natural distribution based on some user info
		//such as total level with a 20% allowed deviation
		//see Calculations.gRandom()
		return Calculations.random(500, 2000);
	}

	@Override
	public void onPaint(Graphics g) {
	}

	public Presets setTreeType(Presets tree) {
		return this.treeType = tree;
	}

	public Presets getTreeType() {
		return this.treeType;
	}

	private void handleMenu() {
		gui = new Menu(this);
		gui.setVisible(true);
	}

	private void checkLevel() {
		//use getRealLevel not boostedLevel
		//realLevel-> doesn't change
		//boostedLevel->"pot up" level
		if (getSkills().getBoostedLevels(Skill.WOODCUTTING) < treeType.getLevel()) {
			log("We don't have the requirements to cut " + treeType.toString() + " logs - Stopping Script");
			stop();
		}
	}

	private void addTasks() {
		chop = new Chop(this);
		taskList.add(chop);
		drop = new Drop(this);
		taskList.add(drop);
	}

	@Override
	public void onMessage(Message m) {
	}

	@Override
	public void onExit() {
		log("STOPPING...");
	}

}
