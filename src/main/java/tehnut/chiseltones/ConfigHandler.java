package tehnut.chiseltones;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {

    public static Configuration config;

    // Categories
    public static String misc = "Misc";

    // Options
    public static int variationAdditionType;

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
        config.setCategoryComment(misc, "Misc settings.");

        String description = "There are 2 modes supported currently: "
                + "\n0 - Allow chiseling of the Ztones Tile into each of the different types Ztones adds at a meta of 0. Then you cycle through from there. This makes the crafting recipes useless. "
                + "\n1 - Allow chiseling between all the blocks within their type. This requires the user to still craft the type, but makes the cycling useless.";

        variationAdditionType = config.getInt("variationAdditionType", misc, 0, 0, 1, description);

        config.save();
    }
}
