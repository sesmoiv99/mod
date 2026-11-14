package fr.axolteam;

import net.fabricmc.api.ClientModInitializer;
import java.util.Set;

public class AxolTeam implements ClientModInitializer {
    public static final Set<String> MEMBERS = Set.of(
        "tyty0869", "noctyr7", "nrkbestplayer", "matx2677"
    );

    @Override
    public void onInitializeClient() {}
}
