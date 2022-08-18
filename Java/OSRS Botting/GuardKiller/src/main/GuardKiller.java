package main;
import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;
import org.osbot.rs07.api.ui.Message;

import java.awt.*;

import gui.Settings;

@ScriptManifest(name = "RS Guard Killer", author = "testabcdef", version = 1.0, info = "", logo = "") 
public class GuardKiller extends Script {   
	
 	@Override
    public void onStart() {

 		Settings gui = new Settings();
 		gui.setVisible(true);

 	}

    @Override
    public int onLoop() {

        return random(500, 5000);
    }
    
    @Override
    public void onExit() {
    }

    @Override
    public final void onMessage(Message m) {
    }

    @Override
    public void onPaint(Graphics2D g) {
    }
}
