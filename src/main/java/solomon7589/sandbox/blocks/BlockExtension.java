package solomon7589.sandbox.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

//the Minecraft Block method is protected, this class is used to extend the Block method instead so that modders can inject their own materials into the Block method so that they can be properly rendered into the game world
public class BlockExtension extends Block{
	public BlockExtension(Material materialIn) {
		super(materialIn); //used to inject the material called into the parent class
	}
}
