package naberius.integration;

import java.util.List;

import com.google.common.collect.Lists;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import naberius.gui.GuiHellForge;
import naberius.init.BlockRegistry;
import naberius.integration.jei.hellforge.HellForgeRecipeCategory;
import naberius.integration.jei.hellforge.HellForgeRecipeHandler;
import naberius.integration.jei.hellforge.HellForgeRecipeMaker;
import net.minecraft.item.ItemStack;

@JEIPlugin
public class NaberiusPlugin implements IModPlugin {

	public static IJeiHelpers jeiHelper;

	@Override
	public void register(IModRegistry registry) {

		jeiHelper = registry.getJeiHelpers();
		IGuiHelper guiHelper = jeiHelper.getGuiHelper();

		registry.addRecipeCategories(new HellForgeRecipeCategory(guiHelper));
		registry.addRecipeHandlers(new HellForgeRecipeHandler());
		registry.addRecipes(HellForgeRecipeMaker.getRecipes());
		registry.addRecipeClickArea(GuiHellForge.class, 80, 34, 25, 16, HellForgeRecipeCategory.CATEGORY);
		registry.addRecipeCategoryCraftingItem(new ItemStack(BlockRegistry.HELL_FORGE), HellForgeRecipeCategory.CATEGORY);

		registry.addDescription(new ItemStack(BlockRegistry.HELL_FORGE), "jei.naberius.desc.HellForge");
		
	}

	@Override
	public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {

	}

}
