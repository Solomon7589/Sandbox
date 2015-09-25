package solomon7589.sandbox.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import solomon7589.sandbox.Reference;
import solomon7589.sandbox.blocks.BlockExtension;

public class TutorialBlocks {
	
	public static Block test_block; //creates a new Block object using the default Minecraft method
	
	public static void init() {
		test_block = new BlockExtension(Material.cloth).setUnlocalizedName("test_block"); //assigns a new block with the unlocalized name "test_block" to the test_block Block object
	}
	
	public static void register() {
		GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5)); //method to register the block in the game, first value is the Block object, second is the name with substring 5 to remove 'item.' from the name
	}
	
	public static void registerRenders() {
		registerRender(test_block); //registers the item object test_item with the games render method
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block); //calls the built in Minecraft Item class getItemFromBlock method and accepts the block name in to automatically create an item object in the game from the block itself
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory")); //tells the game where the items files are for the model and texture .json files with the objects 3 dimensional definitions and model/texture locations
	}
}
