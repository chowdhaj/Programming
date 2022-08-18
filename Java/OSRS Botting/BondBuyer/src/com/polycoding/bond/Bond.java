package com.polycoding.bond;

import org.dreambot.api.wrappers.widgets.message.Message;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.Timer;
import org.dreambot.api.script.Category;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.LinkedList;

import com.polycoding.bond.gui.Menu;
import com.polycoding.bond.core.Task;
import com.polycoding.bond.tasks.*;

@ScriptManifest(author = "testabcdef", name = "BondBuyer", version = 1.0, description = "Buys An OSRS Bond", category = Category.MISC)

/**
 * @author testabcdef
 * @ideas start here...
 * @license Anyone has the right to modify and use this as long as it's for
 *          personal use [i.e. Farming OSRS]. NO ONE is allowed to recycle this
 *          code and sell it [i.e. Paid script]
 */
public class Bond extends AbstractScript {

	private Menu gui;
	private String status;
	private Timer timeElasped;

	private Boolean returnChange;
	private String muleKing;
	private int bondPrice;
	private int endingAction;

	private LinkedList<Task> taskList = new LinkedList<Task>();

	@Override
	public void onStart() {
		log("STARTING...");
		handleGUI();
		timeElasped = new Timer();
		addTasks();
	}

	private void handleGUI() {
		gui = new Menu(this);
		gui.setVisible(true);
		while (gui.isVisible()) {
			sleep(1500);
		}
	}

	@Override
	public int onLoop() {
		for (Task t : taskList) {
			if (t.validate()) {
				t.execute();
			}
		}
		return Calculations.random(500, 2000);
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

		font = new Font("Arial", Font.BOLD, 16);
		g.setFont(font);

		g.drawString("Please Report All Bugs To Me On DreamBot | Feel Free To PM Me ", 10, 330);
	}

	public void addTasks() {
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getMuleKing() {
		return this.muleKing;
	}

	public void setMuleKingName(String muleKing) {
		this.muleKing = muleKing;
		log("Mule King: " + muleKing);
	}

	public int getBondPrice() {
		return this.bondPrice;
	}
	
	public void setBondPrice(int bondPrice) {
		this.bondPrice = bondPrice;
	}
	
	public Boolean getReturnChange() {
		return this.returnChange;
	}

	public void setReturnChange(Boolean returnChange) {
		this.returnChange = returnChange;
	}

	public void setEndingAction(int endingAction) {
		this.endingAction = endingAction;
	}

	@Override
	public void onExit() {
		log("STOPPING...");
	}

	@Override
	public void onMessage(Message m) {
	}
}
