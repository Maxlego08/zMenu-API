package fr.maxlego08.menu;

import fr.maxlego08.menu.api.Inventory;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.pattern.Pattern;
import fr.maxlego08.menu.api.players.inventory.InventoriesPlayer;
import fr.maxlego08.menu.inventory.VInventory;
import fr.maxlego08.menu.inventory.inventories.InventoryDefault;
import fr.maxlego08.menu.zcore.utils.inventory.InventoryResult;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ZInventory implements Inventory {

    /**
     * @param plugin The plugin where the inventory comes from
     * @param name Inventory name
     * @param fileName Inventory file name
     * @param size Inventory size
     * @param buttons List of {@link Button}
     */
    public ZInventory(Plugin plugin, String name, String fileName, int size, List<Button> buttons) {
        super();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getFileName() {
        return "";
    }

    @Override
    public Collection<Button> getButtons() {
        return null;
    }

    @Override
    public <T extends Button> List<T> getButtons(Class<T> type) {
        return null;
    }

    @Override
    public Plugin getPlugin() {
        return null;
    }

    @Override
    public int getMaxPage(Player player, Object... objects) {
        return 1;
    }

    @Override
    public List<Button> sortButtons(int page, Object... objects) {
        return null;
    }

    @Override
    public InventoryResult openInventory(Player player, VInventory inventoryDefault) {
        return InventoryResult.SUCCESS;
    }

    @Override
    public void postOpenInventory(Player player, VInventory inventoryDefault) {

    }

    @Override
    public void closeInventory(Player player, VInventory inventoryDefault) {

    }

    @Override
    public MenuItemStack getFillItemStack() {
        return null;
    }

    public void setFillItemStack(MenuItemStack fillItemStack) {

    }

    @Override
    public int getUpdateInterval() {
        return 0;
    }

    public void setUpdateInterval(int updateInterval) {

    }

    /**
     * @return the size
     */
    public int getSize() {
        return 0;
    }

    /**
     * @return the file
     */
    public File getFile() {
        return null;
    }

    public void setFile(File file) {

    }

    @Override
    public boolean cleanInventory() {
        return false;
    }

    public void setClearInventory(boolean clearInventory) {

    }

    @Override
    public List<Pattern> getPatterns() {
        return null;
    }

    public void setPatterns(List<Pattern> patterns) {

    }
}
