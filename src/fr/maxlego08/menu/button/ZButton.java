package fr.maxlego08.menu.button;

import fr.maxlego08.menu.MenuItemStack;
import fr.maxlego08.menu.api.action.data.ActionPlayerData;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.sound.SoundOption;
import fr.maxlego08.menu.api.utils.OpenLink;
import fr.maxlego08.menu.inventory.inventories.InventoryDefault;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public abstract class ZButton extends ZPlaceholderButton implements Button {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public MenuItemStack getItemStack() {
        return null;
    }

    @Override
    public ItemStack getCustomItemStack(Player player) {
        return null;
    }

    @Override
    public int getSlot() {
        return 0;
    }

    @Override
    public boolean isClickable() {
        return false;
    }

    @Override
    public boolean isPermament() {
        return false;
    }

    @Override
    public boolean hasSpecialRender() {
        return false;
    }

    @Override
    public void onRender(Player player, InventoryDefault inventory) {

    }

    @Override
    public void onClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {

    }

    @Override
    public void onRightClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {

    }

    @Override
    public void onLeftClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {

    }

    @Override
    public void onMiddleClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {

    }

    @Override
    public void onInventoryOpen(Player player, InventoryDefault inventory) {

    }

    @Override
    public void onInventoryClose(Player player, InventoryDefault inventory) {

    }

    @Override
    public int getRealSlot(int inventorySize, int page) {
        return 0;
    }

    @Override
    public boolean closeInventory() {
        return false;
    }

    @Override
    public List<String> getMessages() {
        return null;
    }

    @Override
    public SoundOption getSound() {
        return null;
    }

    @Override
    public String getPlayerHead() {
        return null;
    }

    @Override
    public OpenLink getOpenLink() {
        return null;
    }

    @Override
    public boolean isUpdated() {
        return false;
    }

    @Override
    public boolean isRefreshOnClick() {
        return false;
    }

    @Override
    public List<ActionPlayerData> getData() {
        return null;
    }

    @Override
    public List<String> buildLore(Player player) {
        return null;
    }

    @Override
    public String buildDisplayName(Player player) {
        return null;
    }

    @Override
    public boolean updateOnClick() {
        return false;
    }
}
