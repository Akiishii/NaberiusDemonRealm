package naberius.integration;

import java.util.List;

import com.google.common.collect.Lists;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IJeiRuntime;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import net.minecraft.item.ItemStack;

public class NTAPlugin implements IModPlugin{

	public static IJeiHelpers jeiHelper;
	public static List<ItemStack> disabledItems = Lists.newArrayList();
	
	@Override
	public void register(IModRegistry registry) {
		
		
		
	}

	@Override
	public void onRuntimeAvailable(IJeiRuntime jeiRuntime) {
		
		
		
	}

}
