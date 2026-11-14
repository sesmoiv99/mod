package fr.axolteam.mixin;

import fr.axolteam.AxolTeam;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerListHud.class)
public class PlayerListHudMixin {
    @Inject(method = "getPlayerName", at = @At("RETURN"), cancellable = true)
    private void axolTeam(PlayerListEntry entry, CallbackInfoReturnable<Text> cir) {
        String name = entry.getProfile().name();
        if (AxolTeam.MEMBERS.contains(name.toLowerCase())) {
            cir.setReturnValue(Text.literal("[Axol Team] " + name).formatted(Formatting.AQUA));
        }
    }
}
