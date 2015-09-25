package solomon7589.sandbox.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import solomon7589.sandbox.Reference;

public class TutorialItems {
	
	public static Item test_item; //creates a new Item object using the default Minecraft method
	
	public static void init(){
		test_item = new Item().setUnlocalizedName("test_item"); //assigns a new item with the unlocalized name "test_item" to the test_item Item object
	}
	
	public static void register(){
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5)); //method to register the item in the game, first value is the item object, second is the name with substring 5 to remove 'item.' from the name
	}
	
	public static void registerRenders(){
		registerRender(test_item); //registers the item object test_item with the games render method
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory")); //tells the game where the items files are for the model and texture .json files with the objects 3 dimensional definitions and model/texture locations
	}
}
