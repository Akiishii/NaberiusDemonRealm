package naberius.integration.jei.hellforge;

import javax.annotation.Nonnull;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import naberius.NaberiusCore;
import naberius.api.recipe.hellforge.HellForgeRecipeObject;
import naberius.integration.NaberiusPlugin;
import naberius.tiles.TileHellForge;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class HellForgeRecipeCategory implements IRecipeCategory {

	public static final String CATEGORY = NaberiusCore.ModID + ":HellForge";

	@Nonnull
	protected final IDrawable background;
	@Nonnull
	protected final IDrawableAnimated flame;
	@Nonnull
	protected final IDrawableAnimated arrow;
	@Nonnull
	private final String localizedName = NaberiusCore.INSTANCE.localHelper.getLocalizedString(("jei.naberius.recipe.HellForge"));

	public HellForgeRecipeCategory(IGuiHelper guiHelper) {

	    ResourceLocation backgroundLocation = new ResourceLocation(
	    	NaberiusCore.ModID + ":textures/gui/jei/HellForge_JEI.png");

	    background = NaberiusPlugin.jeiHelper.getGuiHelper().createDrawable(backgroundLocation, 0, 0,
	        120, 40);

	    ResourceLocation furnaceLocation = new ResourceLocation("minecraft","textures/gui/container/furnace.png");
	    IDrawableStatic flameDrawable = guiHelper.createDrawable(furnaceLocation, 176, 0, 14, 14);
	    flame = guiHelper.createAnimatedDrawable(flameDrawable, 300,
	        IDrawableAnimated.StartDirection.TOP, true);

	    IDrawableStatic arrowDrawable = guiHelper.createDrawable(furnaceLocation, 176, 14, 24, 17);
	    this.arrow = guiHelper.createAnimatedDrawable(arrowDrawable, 200,
	        IDrawableAnimated.StartDirection.LEFT, false);
	  }

	@Override
	public void drawAnimations(Minecraft mc) {

		flame.draw(mc, 2, 4);
		arrow.draw(mc, 62, 10);
	}

	@Override
	public void drawExtras(Minecraft mc) {

	}

	@Override
	public IDrawable getBackground() {

		return background;
	}

	@Override
	public String getTitle() {

		return localizedName;
	}

	@Override
	public String getUid() {

		return CATEGORY;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper) {

		recipeLayout.getItemStacks().init(0, true, 25, 0);
		recipeLayout.getItemStacks().init(1, true, 43, 0);
		recipeLayout.getItemStacks().init(2, true, 25, 18);
		recipeLayout.getItemStacks().init(3, true, 43, 18);
		recipeLayout.getItemStacks().init(TileHellForge.SLOT_FUEL, true, 0, 15);
		recipeLayout.getItemStacks().init(TileHellForge.SLOT_OUTPUT, false, 98, 10);

		if (recipeWrapper instanceof HellForgeRecipeJEI) {
			HellForgeRecipeJEI wrapper = (HellForgeRecipeJEI) recipeWrapper;
			// Set inputs
			for (int i = 0; i < wrapper.getInputObjects().size(); ++i) {
				Object obj = wrapper.getInputObjects().get(i);
				HellForgeRecipeObject recipeObject = (HellForgeRecipeObject) obj;
				recipeLayout.getItemStacks().set(i, recipeObject.getPossibleItemStacks());
			}
			// Set output
			recipeLayout.getItemStacks().set(TileHellForge.SLOT_OUTPUT, wrapper.getOutputs());
		}
	}

}
