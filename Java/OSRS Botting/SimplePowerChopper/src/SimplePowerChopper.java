import java.awt.Graphics2D;
import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;


import org.osbot.rs07.api.model.RS2Object;



@ScriptManifest(author = "testabcdef", info = "Chop Logs", name = "SimplePowerChopper", version = 0.1, logo = "")
// Logo: http://imgur.com/a/qdARX

public class SimplePowerChopper extends Script {
	
	public final String TREE = "Tree";
	
	private enum State {
		CHOP, DROP
	}
	
	private State getState() {
		if (inventory.isFull())
            return State.DROP;
		if (inventory.isEmpty()) {
			return State.CHOP;
		}
		return State.CHOP;
	}
 
    @Override
    public void onStart() {
    	log("Starting Script");
    }
 
    @Override
    public int onLoop() throws InterruptedException {
    	
    	switch (getState()) {
    	case CHOP:
    		if (!myPlayer().isAnimating()) {
				RS2Object tree = objects.closest("Tree");
				if (tree != null) {
						log("Chopping");
						if (tree.interact("Chop down"))
								sleep(random(10000, 20000));
					}
			} 
    		break;
			
    	case DROP:
    		if (inventory.isFull()) {
    			inventory.dropAll();
    		}
    		break;
    	}
    	
    	log("End Of Loop");
    	return random(1500, 15000);
    }
 
    @Override
    public void onExit() {
        log("Stopping Script");
    }
 
    @Override
    public void onPaint(Graphics2D g) {
    	// This is the paint of the script
    	
    }
 
}

// SIMPLE TEST SCRIPT BELOW //

/*/
import java.awt.Graphics2D;

import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;
import org.osbot.rs07.api.map.Area;
import org.osbot.rs07.api.map.constants.Banks;
import org.osbot.rs07.api.model.Entity;

//import org.osbot.rs07.api.DepositBox;
//import org.osbot.rs07.api.Bank;
//import org.osbot.rs07.api.Inventory;
//import org.osbot.rs07.api.Objects;
//import org.osbot.rs07.api.Walking;
//import org.osbot.rs07.api.model.RS2Object;
//import org.osbot.rs07.utility.ConditionalSleep; 


@ScriptManifest(author = "testabcdef", info = "Tester", name = "TestScript", version = 0.2, logo = "")
// Logo: http://imgur.com/a/qdARX

public class TestScript extends Script {
 
    @Override
    public void onStart() {
    	
    	 // When you hit "start" this code is run.
    	 // This code is first to execute.
    	 // It will run before the loop is started.
    	 // This code runs before anything else.
    	 
    	
    	// Outputs To OSBot Logger
    	log("Starting Script");
    	
    }
 
    @Override
    public int onLoop() throws InterruptedException {
    	
    	 // This is where bulk of the script goes
    	 // The main parts of the script goes here
    	 
    	
    	// Outputs To OSBot Logger
    	log("Walking To Falador East Bank");
    	
    	// Walks To Falador East Bank
        getWalking().webWalk(new Area[] { Banks.FALADOR_EAST });
        
        // Makes The Bank Usable By Declaring It As An Object/Entity
        Entity closestBankBooth = objects.closest("Bank booth");
        
        try {
        	log("Sleeping");
        	// Sleeps For A Random Time Between 5-7 seconds
            sleep(random(5000,7000));
        } catch (Exception e) {
        	log("Couldn't sleep");
        }
        
        // Outputs To OSBot Logger
    	log("Opening The Bank");
        
        // Open The Bank
        closestBankBooth.interact("Bank");
        
        if (bank.isOpen()) {
        	bank.depositAll();
        	log("Items in");
        }
        
        // Outputs To OSBot Logger
    	log("Close The Bank");
        
        // Close The Bank
        bank.close();
        
        // Outputs To OSBot Logger
    	// log("Walking To Falador West Bank");
    	
    	// Walks To Falador West Bank
        // getWalking().webWalk(new Area[] { Banks.FALADOR_WEST });
    	
        return random(200, 300);
    }
 
    @Override
    public void onExit() {
    	
    	 // This code will run once you click "stop".
    	 // It is the last piece of code that will run
    	 
        log("Stopping Script");
    }
 
    @Override
    public void onPaint(Graphics2D g) {
    	// This is the paint of the script
    }
 
}

*/
