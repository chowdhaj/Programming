import org.dreambot.api.wrappers.interactive.GameObject;
import org.dreambot.api.wrappers.interactive.Player;
import org.dreambot.api.wrappers.widgets.WidgetChild;
import org.dreambot.api.wrappers.widgets.message.Message;
import org.dreambot.api.methods.Calculations;
import org.dreambot.api.methods.interactive.GameObjects;
import org.dreambot.api.methods.interactive.Players;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.utilities.impl.Condition;
import org.dreambot.api.script.Category;

import java.awt.Graphics;

@ScriptManifest(author = "testabcdef", name = "Test", version = 1.0, description = "Test Dev Code", category = Category.MISC)

public class Test extends AbstractScript {

	private Players p;
	private String name = "Lakack";
	private final int POLL_OPEN = 375;
	
	@Override
	public void onStart() {
		log("STARTING...");
	}

	@Override
	public void onMessage (Message m) {

	}	

	@Override
	public int onLoop() {
		
		if (getGrandExchange().isOpen()) {
			log("yes");
		} else {
			log("lololol");
		}
		
		if (getGrandExchange().isBuyOpen()) {
			log("1234");
		} else {
			log("asdfasdf");
		}
		
		if (getPlayerSettings().getConfig(POLL_OPEN) > 0) {
			log("open");
			WidgetChild bar = getWidgets().getWidgetChild(310, 2).getChild(11);
			/*if (bar != null) {
				bar = bar.getChild(11);
			}*/
			if (bar != null && bar.isVisible()) {
				bar.interact();
				sleepUntil(new Condition() {
					public boolean verify() {
						return getPlayerSettings().getConfig(POLL_OPEN) == 0;
					}
				}, Calculations.random(1200, 1500));
			}
		}
		
		return Calculations.random(500, 2000);
	}

	@Override
	public void onExit() {
		log("STOPPING...");
	}

	@Override
	public void onPaint (Graphics g) {
		
	}

}
