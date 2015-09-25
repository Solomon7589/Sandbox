package solomon7589.sandbox.proxy;

import solomon7589.sandbox.init.TutorialBlocks;
import solomon7589.sandbox.init.TutorialItems;

//defines the client side proxy configuration
public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		TutorialBlocks.registerRenders(); //calls the TutorialBlocks.registerRenders method to register mod items in the Minecraft database on the client side
		TutorialItems.registerRenders(); //calls the TutorialItems.registerRenders method to register mod items in the Minecraft database on the client side
	}
}
