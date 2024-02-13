package fr.maxlego08.menu;

import fr.maxlego08.menu.api.Inventory;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.pattern.Pattern;
import fr.maxlego08.menu.api.players.inventory.InventoriesPlayer;
import fr.maxlego08.menu.api.requirement.Requirement;
import fr.maxlego08.menu.api.utils.OpenWithItem;
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

    public ZInventory(Plugin plugin, String name, String fileName, int size, List<Button> buttons) {
        super();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public Collection<Button> getButtons() {
        return null;
    }

    @Override
    public Collection<Pattern> getPatterns() {
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
        return 0;
    }

    @Override
    public int getMaxPage(List<Button> buttons, Player player, Object... objects) {
        return 0;
    }

    @Override
    public List<Button> sortButtons(int page, Object... objects) {
        return null;
    }

    @Override
    public List<Button> sortPatterns(Pattern pattern, int page, Object... objects) {
        return null;
    }

    @Override
    public InventoryResult openInventory(Player player, InventoryDefault inventoryDefault) {
        return null;
    }

    @Override
    public void postOpenInventory(Player player, InventoryDefault inventoryDefault) {

    }

    @Override
    public void closeInventory(Player player, InventoryDefault inventoryDefault) {

    }

    @Override
    public MenuItemStack getFillItemStack() {
        return null;
    }

    @Override
    public int getUpdateInterval() {
        return 0;
    }

    @Override
    public File getFile() {
        return null;
    }

    @Override
    public boolean cleanInventory() {
        return false;
    }

    @Override
    public Requirement getOpenRequirement() {
        return null;
    }

    @Override
    public OpenWithItem getOpenWithItem() {
        return null;
    }
}
