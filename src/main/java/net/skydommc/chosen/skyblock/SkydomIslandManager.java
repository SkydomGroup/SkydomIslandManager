package net.skydommc.chosen.skyblock;

import net.skydommc.chosen.skyblock.Metrics.Metrics;
import net.skydommc.chosen.skyblock.Settings.*;
import net.skydommc.chosen.skyblock.Tips.Synthesis;
import net.skydommc.chosen.skyblock.Tips.SynthesisCommand;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkydomIslandManager extends JavaPlugin {
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        if (this.getConfig().getBoolean("FirstSapling")) {
            try {
                new FirstSapling();
                getLogger().info("Enabled first sapling.");
            } catch (Exception e) {
                e.printStackTrace();

            }

        }
        if (this.getConfig().getBoolean("LavaProtect")) {
            try {
                new LavaProtect();
                getLogger().info("Enabled lava protect.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("PotionEffectKeeper")) {
            try {
                new PotionEffectKeeper();
                getLogger().info("Enabled potion effect keeper.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("HungerKeeper")) {
            try {
                new HungerKeeper();
                getLogger().info("Enabled hunger sapling.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("RailWay")) {
            try {
                new RailWay();
                getLogger().info("Enabled railway.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("IronElevator")) {
            try {

                new IronElevator();
                getLogger().info("Enabled iron elevator.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("SitDownAnywhere")) {
            try {

                new MoreChairs();
                getLogger().info("Enabled sit down anywhere.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("PlayerHeadDrop")) {
            try {

                new PlayerHeadDrop();
                getLogger().info("Enabled player head drop.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("SlimeChunkCommand")) {
            try {

                new SlimeChunk();
                getLogger().info("Enabled slime chunk command.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("ElderGuardianSpawner")) {
            try {

                new ElderGuardianSpawner();
                getLogger().info("Enabled elder guardian spawner.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("ShulkerRespawn")) {
            try {

                new ShulkerRespawn();
                getLogger().info("Enabled shulker respawn.");
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        if (this.getConfig().getBoolean("MoreRecipe")) {
            // 自定义合成表
            this.getLogger().info("Enabled MoreRecipe.");
            Bukkit.resetRecipes();
            // 重置合成配方
            SmithingRecipe Iron_NETHER = new SmithingRecipe(
                new NamespacedKey(this, "Ironj_recipe"),
                new ItemStack(Material.IRON_INGOT),
                new RecipeChoice.MaterialChoice(Material.NETHER_BRICK),
                new RecipeChoice.MaterialChoice(Material.WHITE_DYE)
            );
            Bukkit.addRecipe(Iron_NETHER);
            // 铁锭 下界砖
            CampfireRecipe Iron_NUGGET = new CampfireRecipe(
                new NamespacedKey(this, "iron_nugget_recipe"),
                new ItemStack(Material.IRON_NUGGET),
                Material.BONE,
                (float) 0.2,
                300
            );
            Bukkit.addRecipe(Iron_NUGGET);
            // 铁粒 骨头
            SmithingRecipe Iron_GOLD = new SmithingRecipe(
                    new NamespacedKey(this, "Ironi_recipe"),
                    new ItemStack(Material.IRON_INGOT),
                    new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
                    new RecipeChoice.MaterialChoice(Material.WHITE_DYE)
            );
            Bukkit.addRecipe(Iron_GOLD);
            // 铁锭 金锭
            SmithingRecipe Iron_NETHER_INGOT = new SmithingRecipe(
                    new NamespacedKey(this, "Ironh_recipe"),
                    new ItemStack(Material.IRON_INGOT),
                    new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT),
                    new RecipeChoice.MaterialChoice(Material.WHITE_DYE)
            );
            Bukkit.addRecipe(Iron_NETHER_INGOT);
            // 铁锭 下界合金锭
            SmithingRecipe Iron_COPPER = new SmithingRecipe(
                    new NamespacedKey(this, "Irong_recipe"),
                    new ItemStack(Material.IRON_INGOT),
                    new RecipeChoice.MaterialChoice(Material.COPPER_INGOT),
                    new RecipeChoice.MaterialChoice(Material.WHITE_DYE)
            );
            Bukkit.addRecipe(Iron_COPPER);
            // 铁锭 铜锭
            SmithingRecipe Gold_IRON = new SmithingRecipe(
                new NamespacedKey(this, "Goldf_recipe"),
                new ItemStack(Material.GOLD_INGOT),
                new RecipeChoice.MaterialChoice(Material.IRON_INGOT),
                new RecipeChoice.MaterialChoice(Material.YELLOW_DYE)
            );
            Bukkit.addRecipe(Gold_IRON);
            // 金锭 铁锭
            SmithingRecipe Gold_COPPER = new SmithingRecipe(
                    new NamespacedKey(this, "Golde_recipe"),
                    new ItemStack(Material.GOLD_INGOT),
                    new RecipeChoice.MaterialChoice(Material.COPPER_INGOT),
                    new RecipeChoice.MaterialChoice(Material.YELLOW_DYE)
            );
            Bukkit.addRecipe(Gold_COPPER);
            // 金锭 铜锭
            SmithingRecipe Gold_NETHER_INGOT = new SmithingRecipe(
                    new NamespacedKey(this, "Goldd_recipe"),
                    new ItemStack(Material.GOLD_INGOT),
                    new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT),
                    new RecipeChoice.MaterialChoice(Material.YELLOW_DYE)
            );
            Bukkit.addRecipe(Gold_NETHER_INGOT);
            // 金锭 下界合金锭
            SmithingRecipe Gold_NETHER = new SmithingRecipe(
                    new NamespacedKey(this, "Goldc_recipe"),
                    new ItemStack(Material.GOLD_INGOT),
                    new RecipeChoice.MaterialChoice(Material.NETHER_BRICK),
                    new RecipeChoice.MaterialChoice(Material.YELLOW_DYE)
            );
            Bukkit.addRecipe(Gold_NETHER);
            // 金锭 下界砖
            SmithingRecipe Purpur_block = new SmithingRecipe(
                new NamespacedKey(this, "purpur_block_recipe"),
                new ItemStack(Material.PURPUR_BLOCK),
                new RecipeChoice.MaterialChoice(Material.STONE),
                new RecipeChoice.MaterialChoice(Material.SHULKER_BOX)
            );
            Bukkit.addRecipe(Purpur_block);
            // 紫珀块
            ItemStack Podzal = new ItemStack(Material.PODZOL);
            NamespacedKey Podzalkey = new NamespacedKey(this, "Podzal_key");
            ShapedRecipe Podzalrecipe = new ShapedRecipe(Podzalkey, Podzal);
            Podzalrecipe.shape(" S ", " D ", " B ");
            Podzalrecipe.setIngredient('S', Material.SPRUCE_SAPLING);
            Podzalrecipe.setIngredient('D', Material.DIRT);
            Podzalrecipe.setIngredient('B', Material.BONE_MEAL);
            Bukkit.addRecipe(Podzalrecipe);
            // 灰化土
            SmithingRecipe Nether_INGOT_GOLD = new SmithingRecipe(
                new NamespacedKey(this, "Netherb_INGOT_recipe"),
                new ItemStack(Material.NETHERITE_INGOT),
                new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
                new RecipeChoice.MaterialChoice(Material.BLACK_DYE)
            );
            Bukkit.addRecipe(Nether_INGOT_GOLD);
            // 下界合金锭 金锭
            SmithingRecipe Nether_INGOT_Iron = new SmithingRecipe(
                    new NamespacedKey(this, "Nethera_INGOT_recipe"),
                    new ItemStack(Material.NETHERITE_INGOT),
                    new RecipeChoice.MaterialChoice(Material.IRON_INGOT),
                    new RecipeChoice.MaterialChoice(Material.BLACK_DYE)
            );
            Bukkit.addRecipe(Nether_INGOT_Iron);
            // 下界合金锭 铁锭
            SmithingRecipe COPPER_INGOT = new SmithingRecipe(
                 new NamespacedKey(this, "COPPER_INGOT_recipe"),
                 new ItemStack(Material.COPPER_INGOT),
                 new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT),
                 new RecipeChoice.MaterialChoice(Material.ORANGE_DYE)
            );
            Bukkit.addRecipe(COPPER_INGOT);
            // 铜锭
            StonecuttingRecipe GravelStonecuttingRecipe = new StonecuttingRecipe(
                new NamespacedKey(this, "GravelStonecuttingRecipe_recipe"),
                new ItemStack(Material.GRAVEL),
                Material.COBBLESTONE
            );
            Bukkit.addRecipe(GravelStonecuttingRecipe);
            // 沙砾 切石机
            SmithingRecipe Mycelium = new SmithingRecipe(
                new NamespacedKey(this, "mycelium_recipe"),
                new ItemStack(Material.MYCELIUM),
                new RecipeChoice.MaterialChoice(Material.GRASS_BLOCK),
                new RecipeChoice.MaterialChoice(Material.BROWN_MUSHROOM)
            );
            Bukkit.addRecipe(Mycelium);
            // 菌丝
            SmithingRecipe Grass_block = new SmithingRecipe(
                new NamespacedKey(this, "Grass_block_recipe"),
                new ItemStack(Material.GRASS_BLOCK),
                new RecipeChoice.MaterialChoice(Material.DIRT),
                new RecipeChoice.MaterialChoice(Material.GRASS)
            );
            Bukkit.addRecipe(Grass_block);
            // 草方块
            ItemStack DIAMOND = new ItemStack(Material.DIAMOND);
            NamespacedKey DIAMONDkey = new NamespacedKey(this, "DIAMOND_key");
            ShapedRecipe DIAMONDrecipe = new ShapedRecipe(DIAMONDkey, DIAMOND);
            Podzalrecipe.shape(" G ", "NBN", " G ");
            Podzalrecipe.setIngredient('G', Material.GOLDEN_APPLE);
            Podzalrecipe.setIngredient('N', Material.NETHERITE_INGOT);
            Podzalrecipe.setIngredient('B', Material.BONE_BLOCK);
            Bukkit.addRecipe(DIAMONDrecipe);
            // 钻石
            BlastingRecipe Sand = new BlastingRecipe(
                new NamespacedKey(this, "sand_recipe"),
                new ItemStack(Material.SAND),
                Material.GRAVEL,
                (float) 0.8,
                100
            );
            Bukkit.addRecipe(Sand);
            // 沙子
            BlastingRecipe BLAZE_POWDER = new BlastingRecipe(
                    new NamespacedKey(this, "BLAZE_POWDER_recipe"),
                    new ItemStack(Material.BLAZE_POWDER),
                    Material.REDSTONE,
                    (float) 0.8,
                    110
            );
            Bukkit.addRecipe(BLAZE_POWDER);
            // 烈焰粉
            BlastingRecipe Quartz = new BlastingRecipe(
                new NamespacedKey(this, "Quartz_recipe"),
                new ItemStack(Material.QUARTZ),
                Material.GLASS,
                (float) 0.8,
                100
            );
            Bukkit.addRecipe(Quartz);
            // 石英
            SmokingRecipe SoulSoil = new SmokingRecipe(
                new NamespacedKey(this, "SoulSoil_recipe"),
                new ItemStack(Material.SOUL_SOIL),
                Material.COARSE_DIRT,
                (float) 0.2,
                180
            );
            Bukkit.addRecipe(SoulSoil);
            // 灵魂土
            SmokingRecipe Netherrack = new SmokingRecipe(
                new NamespacedKey(this, "Netherrack_recipe"),
                new ItemStack(Material.NETHERRACK),
                Material.COBBLESTONE,
                (float) 1.2,
                200
            );
            Bukkit.addRecipe(Netherrack);
            // 下界岩
            StonecuttingRecipe SoulSand = new StonecuttingRecipe(
                 new NamespacedKey(this, "SoulSand_recipe"),
                 new ItemStack(Material.SOUL_SAND),
                 Material.SOUL_SOIL
            );
            Bukkit.addRecipe(SoulSand);
            // 灵魂沙
            ItemStack END_STONE = new ItemStack(Material.END_STONE);
            NamespacedKey END_STONE_key = new NamespacedKey(this, "END_STONE_recipe");
            ShapedRecipe END_STONE_recipe = new ShapedRecipe(END_STONE_key, END_STONE);
            END_STONE_recipe.shape("YEY", "ESE", "YEY");
            END_STONE_recipe.setIngredient('Y', Material.YELLOW_DYE);
            END_STONE_recipe.setIngredient('E', Material.ENDER_PEARL);
            END_STONE_recipe.setIngredient('S', Material.STONE);
            Bukkit.addRecipe(END_STONE_recipe);
            // 末地石
            ItemStack AMETHYST_SHARD = new ItemStack(Material.AMETHYST_SHARD);
            NamespacedKey AMETHYST_SHARD_KEY = new NamespacedKey(this, "COLA_KEY");
            ShapelessRecipe AMETHYST_SHARDRecipe = new ShapelessRecipe(AMETHYST_SHARD_KEY, AMETHYST_SHARD);
            AMETHYST_SHARDRecipe.addIngredient(Material.PRISMARINE_SHARD);
            AMETHYST_SHARDRecipe.addIngredient(Material.PURPLE_DYE);
            Bukkit.addRecipe(AMETHYST_SHARDRecipe);
            // 紫水晶碎片
            ItemStack BLAZE_ROD_SHARD = new ItemStack(Material.BLAZE_ROD);
            NamespacedKey BLAZE_ROD_SHARD_KEY = new NamespacedKey(this, "BLAZE_ROD_KEY");
            ShapelessRecipe BLAZE_RODRecipe = new ShapelessRecipe(BLAZE_ROD_SHARD_KEY, BLAZE_ROD_SHARD);
            BLAZE_RODRecipe.addIngredient(Material.BLAZE_POWDER);
            BLAZE_RODRecipe.addIngredient(Material.BLAZE_POWDER);
            Bukkit.addRecipe(BLAZE_RODRecipe);
            // 烈焰棒
            ItemStack COAL = new ItemStack(Material.COAL);
            NamespacedKey COAL_KEY = new NamespacedKey(this, "COLA_KEY");
            ShapelessRecipe COALRecipe = new ShapelessRecipe(COAL_KEY, COAL);
            COALRecipe.addIngredient(Material.CHARCOAL);
            Bukkit.addRecipe(COALRecipe);
            // 煤炭
            ItemStack FLINT = new ItemStack(Material.FLINT);
            NamespacedKey FLINT_KEY = new NamespacedKey(this, "FLINT_KEY");
            ShapelessRecipe FLINTRecipe = new ShapelessRecipe(FLINT_KEY, FLINT);
            FLINTRecipe.addIngredient(2,Material.GRAVEL);
            FLINTRecipe.addIngredient(1,Material.WOODEN_SHOVEL);
            Bukkit.addRecipe(FLINTRecipe);
            // 燧石
            if (this.getConfig().getBoolean("Synthesis")) {
                Bukkit.getPluginManager().registerEvents(new Synthesis(), this);
            }
            if (this.getConfig().getBoolean("BanBat")) {
                Bukkit.getPluginManager().registerEvents(new DeleteSomeCreatures(), this);
            }
            int pluginId = 14293; // 接入统计系统
            Metrics metrics= new Metrics(this, pluginId); // 接入统计系统
            Bukkit.getPluginCommand("Tips").setExecutor(new SynthesisCommand());
        }
    }

    @Override
    public void onDisable() {
        Bukkit.clearRecipes();
        // 清除合成表
        saveConfig();
        // 保存配置文件
    }
}
