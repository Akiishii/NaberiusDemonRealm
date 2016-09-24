package naberius.api.recipe.hellforge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class HellForgeRecipeObject {

	public static final String ITEM_KEY_SPLITTER = "\\*";

	  private List<String> itemKeys = Lists.newArrayList();
	  private List<ItemStack> possibleStacks = Lists.newArrayList();

	  public static HellForgeRecipeObject[] getFromObjectArray(Object... objects) {

	    List<HellForgeRecipeObject> list = Lists.newArrayList();
	    for (Object obj : objects) {
	      list.add(from(obj));
	    }
	    return list.toArray(new HellForgeRecipeObject[] {});
	  }

	  public HellForgeRecipeObject(String oreName, int count) {

	    this(oreName + "*" + count);
	  }

	  public HellForgeRecipeObject(String... itemKeys) {

	    for (String itemKey : itemKeys) {
	      this.itemKeys.add(itemKey);
	      possibleStacks.addAll(getStacksFromKey(itemKey));
	    }
	  }

	  public HellForgeRecipeObject(ItemStack... stacks) {

	    possibleStacks.addAll(Arrays.asList(stacks));
	  }

	  public static HellForgeRecipeObject from(Object obj) {

	    if (obj instanceof String) {
	      return new HellForgeRecipeObject((String) obj);
	    } else if (obj instanceof ItemStack) {
	      return new HellForgeRecipeObject((ItemStack) obj);
	    } else if (obj instanceof HellForgeRecipeObject) {
	      return (HellForgeRecipeObject) obj;
	    } else {
	      throw new IllegalArgumentException(
	          "HellForgeRecipeObject: don't know how to use object of type " + obj.getClass());
	    }
	  }

	  public boolean matches(ItemStack inputStack) {

	    return getMatchingStack(inputStack) != null;
	  }

	  public ItemStack getMatchingStack(ItemStack inputStack) {

	    for (ItemStack recipeStack : possibleStacks) {
	      if (inputStack.isItemEqual(recipeStack) && inputStack.stackSize >= recipeStack.stackSize) {
	        return recipeStack.copy();
	      }
	    }
	    return null;
	  }

	  public List<String> getItemKeys() {

	    return Lists.newArrayList(itemKeys);
	  }

	  public List<ItemStack> getPossibleItemStacks() {

	    return Lists.newArrayList(possibleStacks);
	  }

	  private List<ItemStack> getStacksFromKey(String key) {

	    String[] parts = key.split(ITEM_KEY_SPLITTER);

	    if (parts.length != 2) {
	      throw new IllegalArgumentException("Item key must be in the format \"oreName*count\".");
	    }

	    String oreName = parts[0];
	    int stackSize = Integer.parseInt(parts[1]);
	    if (stackSize < 0) {
	      throw new IllegalArgumentException("Item count must greater than zero!");
	    }
	    List<ItemStack> result = new ArrayList<ItemStack>();

	    ItemStack copy;
	    for (ItemStack stack : OreDictionary.getOres(oreName)) {
	      copy = stack.copy();
	      copy.stackSize = stackSize;
	      result.add(copy);
	    }

	    return result;
	  }
	
}
