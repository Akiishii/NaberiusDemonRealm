package naberius.commands;

import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import naberius.NaberiusCore;
import naberius.config.NaberiusConfig;
import naberius.dimension.CustomTeleporter;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class TeleporterCommand extends CommandBase{

	private final List<String> aliases;
	
	public TeleporterCommand() {
		aliases = Lists.newArrayList(NaberiusCore.ModID, "TP", "tp");
	}

	@Override
	@Nonnull
	public String getCommandName() {
		return "tp";
	}

	@Override
	@Nonnull
	public String getCommandUsage(@Nonnull ICommandSender sender) {
		return "tp <id>";
	}
	
	@Override
	@Nonnull
	public List<String> getCommandAliases() {
		return aliases;
	}

	@Override
	public void execute(@Nonnull MinecraftServer server, @Nonnull ICommandSender sender, @Nonnull String[] args) throws CommandException {
		
		if(args.length < 1){
			
			sender.addChatMessage(new TextComponentString("The correct usage of this Command is: /tp <id>"));
			
		}
		
		String s = args[0];
		int dim;
		
		try {
			dim = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			sender.addChatMessage(new TextComponentString(TextFormatting.RED + "Error parsing dimension!"));
			return;
		}
		
		if(sender instanceof EntityPlayer){
			if(dim == 0 || dim == NaberiusConfig.DIMENSIONID){
				CustomTeleporter.teleportToDimension((EntityPlayer) sender, dim, 0, 100, 0);
			}else{
				sender.addChatMessage(new TextComponentString(TextFormatting.RED + "You can only teleport between the Demon Dimension and the Overworld!!!!"));
			}
		}	
	}
	
	@Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    @Nonnull
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos pos) {
        return Collections.emptyList();
    }


}
