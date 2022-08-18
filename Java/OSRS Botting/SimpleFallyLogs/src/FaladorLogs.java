import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;
import org.osbot.rs07.api.map.Position;
import org.osbot.rs07.api.model.RS2Object;
import org.osbot.rs07.input.mouse.MiniMapTileDestination;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.ui.Skill;

import java.awt.*;

@ScriptManifest(name = "FaladorLogs", author = "testabcdef", version = 1.0, info = "", logo = "") 
public class FaladorLogs extends Script {

	public final String TREE = "Tree";

	private Area BANK_AREA = new Area(3011, 3355, 3012, 3355);
	private Area CHOP_AREA = new Area(3002, 3358, 3000, 3358);
	
	 private long startTime;
	
	 private enum State { CHOP, WALK_TO_BANK, BANK, WALK_TO_CHOP };
	 
	    // States are used to describe what the character is doing
	    private State getState() {
	        if (inventory.isFull() && CHOP_AREA.contains(myPlayer()))
	            return State.WALK_TO_BANK;
	        if (inventory.isFull() && BANK_AREA.contains(myPlayer()))
	            return State.BANK;
	        if (inventory.isEmpty() && BANK_AREA.contains(myPlayer()))
	            return State.WALK_TO_CHOP;
	        return State.CHOP;
	    }

	    public final String formatTime(final long ms){
	        long s = ms / 1000, m = s / 60, h = m / 60;
	        s %= 60; m %= 60; h %= 24;
	        return String.format("%02d:%02d:%02d", h, m, s);
	        
	    }
	    
	    // Timing for recording XP gain
	    public final String formatValue(final int v){
	        return (v > 1_000_000) ? String.format("%.2fm", (double) (v / 1_000_000)) :
	               (v > 1000) ? String.format("%.1fk", (double) (v / 1000)) :
	               v + "";
	    }
	    // XP gain recording stuff
	    
	    @Override
	    public void onStart() {
	    	// Code here will execute before the loop is started
	    	log("Starting Script");
	    	startTime = System.currentTimeMillis();
	    	getExperienceTracker().start(Skill.WOODCUTTING);
	    }
    
	    @Override
	    public void onExit() {
	    	// Code here will execute after the script ends
	    	log("Stopping Script");
	    }

	    @Override
	    public int onLoop() throws InterruptedException {
	    	switch (getState()) {
	    		case CHOP:
	    				if (!myPlayer().isAnimating()) {
	    						RS2Object tree = objects.closest(TREE);
	    						if (tree != null) {
	    								if (tree.interact("Chop down"))
	    										sleep(random(10000, 20000));
	    							}
	    					} 
	    				break;
	 
         case WALK_TO_BANK:
             getWalking().webWalk(BANK_AREA);
             sleep(random(500, 11000));
             break;
             
         case WALK_TO_CHOP:
        	 getWalking().webWalk(CHOP_AREA);
             sleep(random(1000, 4000));
             break;
             
         case BANK:
             RS2Object bankBooth = objects.closest("Bank booth");
             if (bankBooth != null) {
                 if (bankBooth.interact("Bank")) {
                     if (!bank.isOpen()) {
                    	 bank.depositAll();
                         sleep(random(3000,12000)); }
                     //bank.depositAll();
                 }
             }
             break;
     }
        return(random(500,7500)); // The amount of time in milliseconds before the loop starts over
    }

    @Override
    public void onPaint(Graphics2D g) {
        // This is where you will put your code for paint(s)
    }
}
