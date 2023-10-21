package fr.maxlego08.menu.loader;

import fr.maxlego08.menu.MenuItemStack;
import fr.maxlego08.menu.api.InventoryManager;
import fr.maxlego08.menu.zcore.utils.loader.Loader;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class MenuItemStackLoader implements Loader<MenuItemStack> {

    private final InventoryManager manager;

    /**
     * @param manager the inventory manager
     */
    public MenuItemStackLoader(InventoryManager manager) {
        super();
        this.manager = manager;
    }

    /**
     * Load ItemStack
     */
    public MenuItemStack load(YamlConfiguration configuration, String path, Object... objects) {

        return null;
    }

    /**
     *
     */
    public void save(MenuItemStack item, YamlConfiguration configuration, String path, File file, Object... objects) {

    }

}
