package naberius.integration.jei.hellforge;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import naberius.api.recipe.hellforge.HellForgeRecipe;

public class HellForgeRecipeMaker {

	@Nonnull
	public static List<HellForgeRecipeJEI> getRecipes() {

		ArrayList<HellForgeRecipeJEI> recipes = new ArrayList<HellForgeRecipeJEI>();

		for (HellForgeRecipe smelterRecipe : HellForgeRecipe.allRecipes) {
			recipes.add(new HellForgeRecipeJEI(smelterRecipe));
		}

		return recipes;
	}

}
