package fr.maxlego08.menu;

import fr.maxlego08.menu.api.InventoryManager;
import fr.maxlego08.menu.api.loader.MaterialLoader;
import fr.maxlego08.menu.zcore.utils.Banner;
import fr.maxlego08.menu.zcore.utils.Firework;
import fr.maxlego08.menu.zcore.utils.LeatherArmor;
import fr.maxlego08.menu.zcore.utils.Potion;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MenuItemStack {

    /**
     * @return the inventoryManager
     */
    public InventoryManager getInventoryManager() {
        return null;
    }

    public ItemStack build(Player player) {
       return null;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return null;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return null;
    }

    /**
     * @return the url
     */
    @Nullable
    public String getUrl() {
        return null;
    }

    /**
     * @return the data
     */
    public int getData() {
        return 0;
    }

    /**
     * @return the durability
     */
    public int getDurability() {
        return 0;
    }

    /**
     * @return the potion
     */
    public Potion getPotion() {
        return null;
    }

    /**
     * @return the lore
     */
    public List<String> getLore() {
        return null;
    }

    /**
     * @return the flags
     */
    public List<ItemFlag> getFlags() {
        return null;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return null;
    }

    /**
     * @return the isGlowing
     */
    public boolean isGlowing() {
        return false;
    }

    /**
     * @return the modelID
     */
    public String getModelID() {
        return null;
    }

    /**
     * @return the enchantments
     */
    public Map<Enchantment, Integer> getEnchantments() {
        return null;
    }

    /**
     * @return the banner
     */
    public Banner getBanner() {
        return null;
    }

    /**
     * @return the firework
     */
    public Firework getFirework() {
        return null;
    }

    /**
     * @return the leather armor
     */
    public LeatherArmor getLeatherArmor() {
        return null;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {

    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {

    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {

    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {

    }

    /**
     * @param durability the durability to set
     */
    public void setDurability(int durability) {

    }

    /**
     * @param potion the potion to set
     */
    public void setPotion(Potion potion) {

    }

    /**
     * @param lore the lore to set
     */
    public void setLore(List<String> lore) {

    }

    /**
     * @param flags the flags to set
     */
    public void setFlags(List<ItemFlag> flags) {

    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {

    }

    /**
     * @param isGlowing the isGlowing to set
     */
    public void setGlowing(boolean isGlowing) {

    }

    /**
     * @param modelID the modelID to set
     */
    public void setModelID(String modelID) {

    }

    /**
     * @param modelID the modelID to set
     */
    public void setModelID(int modelID) {

    }

    /**
     * @param enchantments the enchantments to set
     */
    public void setEnchantments(Map<Enchantment, Integer> enchantments) {

    }

    /**
     * @param banner the banner to set
     */
    public void setBanner(Banner banner) {

    }

    /**
     * @param firework the firework to set
     */
    public void setFirework(Firework firework) {

    }

    /**
     * @param leatherArmor the leather armor to set
     */
    public void setLeatherArmor(LeatherArmor leatherArmor) {

    }

    public String getFilePath() {
        return null;
    }

    public String getPath() {
        return null;
    }

}
