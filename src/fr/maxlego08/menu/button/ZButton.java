package fr.maxlego08.menu.button;

import fr.maxlego08.menu.MenuItemStack;
import fr.maxlego08.menu.api.Inventory;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.players.DataManager;
import fr.maxlego08.menu.api.requirement.Action;
import fr.maxlego08.menu.api.requirement.Requirement;
import fr.maxlego08.menu.api.requirement.data.ActionPlayerData;
import fr.maxlego08.menu.api.sound.SoundOption;
import fr.maxlego08.menu.api.utils.OpenLink;
import fr.maxlego08.menu.inventory.inventories.InventoryDefault;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
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

    /**
     * @param itemStack the itemStack to set
     */
    public ZButton setItemStack(MenuItemStack itemStack) {
        return this;
    }

    @SuppressWarnings("deprecation")
    @Override
    public ItemStack getCustomItemStack(Player player) {
        return null;
    }

    @Override
    public int getSlot() {
        return 0;
    }

    /**
     * @param slot the slot to set
     */
    public ZButton setSlot(int slot) {
        return this;
    }

    @Override
    public boolean isClickable() {
        return true;
    }

    @Override
    public boolean isPermanent() {
        return false;
    }

    /**
     * @param isPermanent the isPermanent to set
     */
    public ZButton setPermanent(boolean isPermanent) {
        return this;
    }

    @Override
    public List<String> getMessages() {
        return null;
    }

    /**
     * @param messages
     */
    public ZButton setMessages(List<String> messages) {
        return this;
    }

    @Override
    public int getRealSlot(int inventorySize, int page) {
        return 0;
    }

    @Override
    public SoundOption getSound() {
        return null;
    }

    @Override
    public boolean hasSpecialRender() {
        return this.getSlots().size() > 0;
    }

    @Override
    public String getPlayerHead() {
        return null;
    }

    public ZButton setPlayerHead(String playerHead) {
        return this;
    }

    @Override
    public void onRender(Player player, InventoryDefault inventory) {
    }

    @Override
    public void onLeftClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {
    }

    @Override
    public void onRightClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {
    }

    @Override
    public void onMiddleClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {
    }

    @Override
    public void onInventoryClose(Player player, InventoryDefault inventory) {

    }

    @Override
    public void onClick(Player player, InventoryClickEvent event, InventoryDefault inventory, int slot) {
    }

    @Override
    public void onInventoryOpen(Player player, InventoryDefault inventory) {

    }

    @Override
    public boolean closeInventory() {
        return false;
    }

    /**
     * @param buttonName the buttonName to set
     */
    public ZButton setButtonName(String buttonName) {
        return this;
    }

    /**
     * @param closeInventory
     */
    public ZButton setCloseInventory(boolean closeInventory) {
        return this;
    }

    /**
     * @param soundOption
     */
    public ZButton setSoundOption(SoundOption soundOption) {
        return this;
    }

    @Override
    public OpenLink getOpenLink() {
        return null;
    }

    public void setOpenLink(OpenLink openLink) {

    }

    @Override
    public boolean isUpdated() {
        return false;
    }

    public void setUpdated(boolean isUpdated) {

    }

    @Override
    public boolean isRefreshOnClick() {
        return false;
    }

    public void setRefreshOnClick(boolean refreshOnClick) {

    }

    @Override
    public List<ActionPlayerData> getData() {
        return null;
    }

    public void setDatas(List<ActionPlayerData> datas) {

    }

    @Override
    public boolean updateOnClick() {
        return false;
    }

    public void setUpdateOnClick(boolean updateOnClick) {

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
    public void onBackClick(Player player, InventoryClickEvent event, InventoryDefault inventory, List<Inventory> oldInventories, Inventory toInventory, int slot) {
    }

    @Override
    public List<Requirement> getClickRequirements() {
        return null;
    }

    public void setClickRequirements(List<Requirement> clickRequirements) {

    }

    @Override
    public Requirement getViewRequirement() {
        return null;
    }

    public void setViewRequirement(Requirement viewRequirement) {

    }

    @Override
    public boolean hasPermission() {
        return false;
    }

    @Override
    public boolean checkPermission(Player player, InventoryDefault inventory) {
        return super.checkPermission(player, inventory);
    }

    @Override
    public List<Action> getActions() {
        return null;
    }
}
