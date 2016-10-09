package naberius;

import java.util.Map;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Maps;

import mcjty.lib.base.ModBase;
import naberius.commands.TeleporterCommand;
import naberius.gui.GuiItemManual;
import naberius.init.ItemRegistry;
import naberius.proxy.CommonProxy;
import naberius.utils.LocalizationHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = NaberiusCore.ModID, name = NaberiusCore.Name, dependencies = "required-after:Forge@["
		+ NaberiusCore.MIN_FORGE_VER + ",);required-after:McJtyLib@[" + NaberiusCore.MIN_MCJTYLIB_VER
		+ ",)", version = NaberiusCore.VersionFull, acceptedMinecraftVersions = "[1.10,1.11)")
public class NaberiusCore implements ModBase {

	public static final String ModID = "naberius";
	public static final String SnapshotVersion = "snapshot_1a";
	public static final String VersionFull = "0.0.1_alpha_" + SnapshotVersion;
	public static final String Version = "0.0.1";
	public static final String Name = "Naberius - The Demon Realm";
	public static final String MIN_FORGE_VER = "12.18.1.2079";
	public static final String MIN_MCJTYLIB_VER = "1.10-1.9.9";
	public static final String MCVersion = "1.10.2";

	@SidedProxy(clientSide = "naberius.proxy.ClientProxy", serverSide = "naberius.proxy.ServerProxy")
	public static CommonProxy PROXY;

	@Mod.Instance("naberius")
	public static NaberiusCore INSTANCE;

	private final Map<String, LocalizationHelper> locHelpers = Maps.newHashMap();

	public static LocalizationHelper localHelper;
	
	public static Logger logger;

	public final CreativeTabs tab = new CreativeTabs(ModID) {

		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(ItemRegistry.DEMONIC_SWORD);
		}

		@Override
		public Item getTabIconItem() {
			return null;
		}

	};

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {

		logger = e.getModLog();
		
		localHelper = new LocalizationHelper(ModID).setReplaceAmpersand(true);
		NaberiusCore.INSTANCE.registerLocalizationHelperForMod(ModID, localHelper);
		
		PROXY.preInit(e);
		
		
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		
		PROXY.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		
		PROXY.postInit(e);
	}

	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent e) {
		e.registerServerCommand(new TeleporterCommand());
	}

	@Override
	public String getModId() {
		return ModID;
	}

	@Override
	public void openManual(EntityPlayer player, int bookIndex, String page) {

		GuiItemManual.locatePage = page;
		player.openGui(NaberiusCore.INSTANCE, bookIndex, player.worldObj, (int) player.posX, (int) player.posY,
				(int) player.posZ);

	}

	public LocalizationHelper getLocalizationHelperForMod(String modId) {

		return locHelpers.get(modId.toLowerCase());
	}

	public void registerLocalizationHelperForMod(String modId, LocalizationHelper loc) {

		locHelpers.put(modId.toLowerCase(), loc);
	}

}
