package naberius.utils;

import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public interface IRegistry {

	  public void addRecipes();
	  public void addOreDict();

	  // Formerly IHasVariants
	  public String getName();
	  public String getFullName();
	  public String getModId();
	  //public List<String> getVariantNames();

	  public List<ModelResourceLocation> getVariants();
	  //public ItemMeshDefinition getCustomMesh();
	  public boolean registerModels();
	
}
