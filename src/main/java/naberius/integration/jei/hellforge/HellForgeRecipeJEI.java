package naberius.integration.jei.hellforge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;

import com.google.common.collect.Lists;

import mezz.jei.api.recipe.BlankRecipeWrapper;
import naberius.api.recipe.hellforge.HellForgeRecipe;
import naberius.api.recipe.hellforge.HellForgeRecipeObject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;

public class HellForgeRecipeJEI extends BlankRecipeWrapper{

	@Nonnull
	  private final HellForgeRecipe recipe;

	  public HellForgeRecipeJEI(@Nonnull HellForgeRecipe recipe) {

	    this.recipe = recipe;
	  }

	  public List<HellForgeRecipeObject> getInputObjects() {

	    return Arrays.asList(recipe.getInputs());
	  }

	  @Override
	  public List getInputs() {

	    List<ItemStack> list = Lists.newArrayList();
	    for (HellForgeRecipeObject recipeObject : recipe.getInputs()) {
	      list.addAll(recipeObject.getPossibleItemStacks());
	    }
	    return list;
	  }

	  @Override
	  public List getOutputs() {

	    return Collections.singletonList(recipe.getOutput());
	  }

	  /*@Override
	  public void drawInfo(@Nonnull Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX,
	      int mouseY) {

	    FontRenderer fontRender = minecraft.fontRendererObj;
	    String str = String.format("%.1f XP", recipe.getExperience());
	    fontRender.drawStringWithShadow(str, 63, 0, 0xFFFFFF);
	    str = recipe.getCookTime() + "t";
	    fontRender.drawStringWithShadow(str, 66, 28, 0xFFFFFF);
	  }*/
	
}
