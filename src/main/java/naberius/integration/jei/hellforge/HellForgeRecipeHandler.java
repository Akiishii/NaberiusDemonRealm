package naberius.integration.jei.hellforge;

import javax.annotation.Nonnull;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;

public class HellForgeRecipeHandler implements IRecipeHandler<HellForgeRecipeJEI> {

	  @Override
	  public String getRecipeCategoryUid() {

	    return HellForgeRecipeCategory.CATEGORY;
	  }

	  //@Override // TODO: Uncomment in 1.10.x
	  public String getRecipeCategoryUid(HellForgeRecipeJEI arg0) {

	    return HellForgeRecipeCategory.CATEGORY;
	  }

	  @Override
	  public Class<HellForgeRecipeJEI> getRecipeClass() {

	    return HellForgeRecipeJEI.class;
	  }

	  @Override
	  public IRecipeWrapper getRecipeWrapper(@Nonnull HellForgeRecipeJEI recipe) {

	    return recipe;
	  }

	  @Override
	  public boolean isRecipeValid(HellForgeRecipeJEI recipe) {

	    return recipe.getInputObjects().size() > 0 && recipe.getOutputs().size() > 0;
	  }


}
