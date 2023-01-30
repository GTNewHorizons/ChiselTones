package tehnut.chiseltones;

import static com.riciJak.Ztones.init.ModBlocks.*;

import java.io.File;

import net.minecraft.block.Block;

import com.cricketcraft.chisel.api.carving.CarvingUtils;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = ModInformation.ID,
        name = ModInformation.NAME,
        version = ModInformation.VERSION,
        dependencies = ModInformation.DEPEND)
public class ChiselTones {

    @Mod.Instance
    public static ChiselTones instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(new File(event.getModConfigurationDirectory(), "ChiselTones.cfg"));
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        addVariations();
    }

    public static void addVariations() {
        if (ConfigHandler.variationAdditionType == 0) {
            addVariationWithoutMeta("BaseTile", stoneTile, 1, true);
            addVariationWithoutMeta("BaseTile", agonBlock, 1, enableAgon);
            addVariationWithoutMeta("BaseTile", bittBlock, 2, enableBitt);
            addVariationWithoutMeta("BaseTile", crayBlock, 3, enableCray);
            addVariationWithoutMeta("BaseTile", fortBlock, 4, enableFort);
            addVariationWithoutMeta("BaseTile", iszmBlock, 5, enableIszm);
            addVariationWithoutMeta("BaseTile", jeltBlock, 6, enableJelt);
            addVariationWithoutMeta("BaseTile", korpBlock, 7, enableKorp);
            addVariationWithoutMeta("BaseTile", krypBlock, 8, enableKryp);
            addVariationWithoutMeta("BaseTile", lairBlock, 9, enableLair);
            addVariationWithoutMeta("BaseTile", laveBlock, 10, enableLave);
            addVariationWithoutMeta("BaseTile", mintBlock, 11, enableMint);
            addVariationWithoutMeta("BaseTile", mystBlock, 12, enableMyst);
            addVariationWithoutMeta("BaseTile", redsBlock, 13, enableReds);
            addVariationWithoutMeta("BaseTile", roenBlock, 14, enableRoen);
            addVariationWithoutMeta("BaseTile", solsBlock, 15, enableSols);
            addVariationWithoutMeta("BaseTile", tankBlock, 16, enableTank);
            addVariationWithoutMeta("BaseTile", vectBlock, 17, enableVect);
            addVariationWithoutMeta("BaseTile", venaBlock, 18, enableVena);
            addVariationWithoutMeta("BaseTile", zechBlock, 19, enableZech);
            addVariationWithoutMeta("BaseTile", zionBlock, 20, enableZion);
            addVariationWithoutMeta("BaseTile", zomeBlock, 21, enableZome);
            addVariationWithoutMeta("BaseTile", zoneBlock, 22, enableZone);
            addVariationWithoutMeta("BaseTile", zorgBlock, 23, enableZorg);
            addVariationWithoutMeta("BaseTile", reedBlock, 24, enableReed);
            addVariationWithoutMeta("BaseTile", syncBlock, 25, enableSync);
            addVariationWithoutMeta("BaseTile", zkulBlock, 26, enableZkul);
            addVariationWithoutMeta("BaseTile", azurBlock, 27, enableAzur);
            addVariationWithoutMeta("BaseTile", zetaBlock, 28, enableZeta);
            addVariationWithoutMeta("BaseTile", zestBlock, 29, enableZest);
            addVariationWithoutMeta("BaseTile", zoeaBlock, 30, enableZoea);
            addVariationWithoutMeta("BaseTile", zaneBlock, 31, enableZane);
            addVariationWithoutMeta("BaseTile", zythBlock, 32, enableZyth);
            addVariationWithoutMeta("BaseTile", ztylBlock, 33, true);

        } else if (ConfigHandler.variationAdditionType == 1) {

            addVariationFast("Agon", agonBlock, 15, enableAgon);
            addVariationFast("Bitt", bittBlock, 15, enableBitt);
            addVariationFast("Cray", crayBlock, 15, enableCray);
            addVariationFast("Fort", fortBlock, 15, enableFort);
            addVariationFast("Iszm", iszmBlock, 15, enableIszm);
            addVariationFast("Jelt", jeltBlock, 15, enableJelt);
            addVariationFast("Korp", korpBlock, 15, enableKorp);
            addVariationFast("Kryp", krypBlock, 15, enableKryp);
            addVariationFast("Lair", lairBlock, 15, enableLair);
            addVariationFast("Lave", laveBlock, 15, enableLave);
            addVariationFast("Mint", mintBlock, 15, enableMint);
            addVariationFast("Myst", mystBlock, 15, enableMyst);
            addVariationFast("Reds", redsBlock, 15, enableReds);
            addVariationFast("Roen", roenBlock, 15, enableRoen);
            addVariationFast("Sols", solsBlock, 15, enableSols);
            addVariationFast("Tank", tankBlock, 15, enableTank);
            addVariationFast("Vect", vectBlock, 15, enableVect);
            addVariationFast("Vena", venaBlock, 15, enableVena);
            addVariationFast("Zech", zechBlock, 15, enableZech);
            addVariationFast("Zion", zionBlock, 15, enableZion);
            addVariationFast("Zome", zomeBlock, 15, enableZome);
            addVariationFast("Zone", zoneBlock, 15, enableZone);
            addVariationFast("Zorg", zorgBlock, 15, enableZorg);
            addVariationFast("Reed", reedBlock, 15, enableReed);
            addVariationFast("Sync", syncBlock, 15, enableSync);
            addVariationFast("Zkul", zkulBlock, 15, enableZkul);
            addVariationFast("Azur", azurBlock, 15, enableAzur);
            addVariationFast("Zeta", zetaBlock, 15, enableZeta);
            addVariationFast("Zest", zestBlock, 15, enableZest);
            addVariationFast("Zoea", zoeaBlock, 15, enableZoea);
            addVariationFast("Zane", zaneBlock, 15, enableZane);
            addVariationFast("Zyth", zythBlock, 15, enableZyth);
            addVariationFast("Ztyl", ztylBlock, 15, true);
        }
    }

    /**
     *
     * @param groupName - Name of Chisel group to add to
     * @param block     - Block to add
     * @param maxMeta   - Highest meta of the block
     * @param config    - Does the config allow
     */
    private static void addVariationFast(String groupName, Block block, int maxMeta, boolean config) {
        if (config)
            for (int meta = 0; meta <= maxMeta; meta++) CarvingUtils.chisel.addVariation(groupName, block, meta, meta);
    }

    /**
     *
     * @param groupName - Name of Chisel group to add to
     * @param block     - Block to add
     * @param order     - What position to put the block at
     * @param config    - Does the config allow
     */
    private static void addVariationWithoutMeta(String groupName, Block block, int order, boolean config) {
        if (config) CarvingUtils.chisel.addVariation(groupName, block, 0, order);
    }
}
