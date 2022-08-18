// Import classes from OSBot
import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;
import org.osbot.rs07.api.model.RS2Object;
import org.osbot.rs07.api.ui.Message;
import org.osbot.rs07.api.ui.Skill;
import org.osbot.rs07.event.WalkingEvent;
import org.osbot.rs07.api.map.Area;

// Import all classes from ‘java.awt’ // Achieved using the wild-card ( * )
import java.awt.*;

// Basic information about script // Displayed during script selection
@ScriptManifest(name = "Grand Exchange Oaks", author = "testabcdef", version = 3.0, info = "Chops Oaks At Varrock Castle", logo = "") 
public class OakCutter extends Script {
	
	/*
	 * BUGS
	 * - Walks To Far [SQUASHED]
	 * - Doesn't Bank [SQUASHED]
	 * - To Slow [SQUASHED]
	 * ADD
	 * - Interactive Paint [WIP]
	 */
	
	private int logsChopped = 0; 
	
	private int XP = 0;
	
	private int moneyMade = 0;
	
	private int startingLevel = 0; 
	
	private long startTime;
	
	//private Area BANK_AREA = new Area(3188, 3446, 3184, 3436); // Varrock Bank West
	//private Area CHOP_AREA = new Area(3188, 3463, 3196, 3455); // Varrock South - Dark Wizard Circle

	private Area BANK_AREA = new Area(3181, 3447, 3190, 3436); // Varrock Bank West	
	private Area CHOP_AREA = new Area(3188, 3463, 3195, 3458); // Grand Exchange - Varrock Castle
	private Area CASTLE = new Area (3191, 3490, 3194, 3481);
	
	public final String formatTime(final long ms) {
	    long s = ms / 1000, m = s / 60, h = m / 60;
	    s %= 60; m %= 60; h %= 24;
	    return String.format("%02d:%02d:%02d", h, m, s);
	}
	
	 private enum State { CHOP, BANK };

	    private State getState() {
	    	
	        if (inventory.isFull()) { return State.BANK; }
	     
	        return State.CHOP; 
	    }
	    
    @Override
    public void onStart() {
    	log("Starting Script..."); 
    	startTime = System.currentTimeMillis();
    	getExperienceTracker().start(Skill.WOODCUTTING);
    	startingLevel = getSkills().getStatic(Skill.WOODCUTTING);
    }
    
    @Override
    public void onMessage(Message m) {
    	if (m.getMessage().contains("oak")) {
    		logsChopped++;
			XP += 37;
			moneyMade += 60;
    	}
    }

    @Override
    public int onLoop() throws InterruptedException { 
    	
    	switch (getState()) {
    	
    	case CHOP:
    		if (!myPlayer().isAnimating()) {
				RS2Object tree = objects.closest("Oak");
				if (tree != null) {
						if (tree.interact("Chop down")) {
							sleep(random(200, 2000));
							log("Cutting down tree");
						}
					}
    			} 
            break;
                     
        case BANK:
        	log("Walking to bank");
        	getWalking().webWalk(BANK_AREA);
        	RS2Object bankBooth = objects.closest("Bank booth");
            if (bankBooth != null && BANK_AREA.contains(myPlayer())) { 
                if (bankBooth.interact("Bank")) {
                    while (!bank.isOpen())
                        sleep(random(300,3000)); 
                    	bank.depositAll("Oak logs");
                    	log("Logs have been banked");
                }
            }  
        	if (!(inventory.isFull())) {
        		log("Inventory is NOT full"); 
        		getWalking().webWalk(CASTLE);
        		getWalking().webWalk(CHOP_AREA);
    		}
    	}    
    	return random(700, 7000);
    }
    
    @Override
    public void onExit() {
    	log("Stopping Script... ");
    	
    }
 
    @Override
    public void onPaint(Graphics2D g) {
    	
    	String currentTime = formatTime(System.currentTimeMillis() - startTime);
    	long testTime = (System.currentTimeMillis() - startTime) / 60000;
    	g.setColor(Color.black);
    	g.setColor(new Color(0, 0, 0, 200));
    	g.fillRect(7, 345, 504, 130);
    	
    	Font font = new Font("Times New Roman", Font.BOLD, 22);
    	g.setFont(font);
    	
    	g.setColor(Color.white);
    	g.drawString("Ghetto Oak Chopper | By testabcdef | v" + getVersion(), 20, 374);
    	
    	font = new Font("Arial", Font.BOLD, 12);
    	g.setFont(font);
    	
    	g.drawString("Time Ran: " + currentTime, 20, 398);
    	g.drawString("Logs Chopped: " + logsChopped, 20, 418); 
    	g.drawString("Money Made: " + moneyMade, 20, 458);			
    	    	
    	g.drawString("XP Gained: " + XP, 20, 438); 					
    	g.drawString("Per Hour: " + getExperienceTracker().getGainedXPPerHour(Skill.WOODCUTTING) , 150, 438);
    	g.drawString("Started At: " + startingLevel, 270, 418);
    	g.drawString("Current Level: " + getSkills().getStatic(Skill.WOODCUTTING), 270, 438);
    	g.drawString("Gained " + getExperienceTracker().getGainedLevels(Skill.WOODCUTTING) + " Level (s)", 270, 458);
    	    
    	g.drawString("Per Hour: " + (logsChopped * 60) / testTime, 150, 418);
    	g.drawString("Per Hour: " + (moneyMade * 60) / testTime, 150, 458);
    }
}






