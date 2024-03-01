package fr.maxlego08.menu;

import fr.maxlego08.menu.api.InventoryManager;
import fr.maxlego08.menu.api.attribute.IAttribute;
import fr.maxlego08.menu.api.utils.Placeholders;
import fr.maxlego08.menu.zcore.utils.Banner;
import fr.maxlego08.menu.zcore.utils.Firework;
import fr.maxlego08.menu.zcore.utils.LeatherArmor;
import fr.maxlego08.menu.zcore.utils.Potion;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class MenuItemStack {

    /**
     * @return the inventoryManager
     */
    public InventoryManager getInventoryManager() {
        return null;
    }

    public ItemStack build(Player player) {
        return build(player, true);
    }

    public ItemStack build(Player player, boolean useCache) {
        return build(player, useCache, new Placeholders());
    }

    public ItemStack build(Player player, boolean useCache, Placeholders placeholders) {
        return null;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return null;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {

    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return null;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {

    }

    /**
     * @return the url
     */
    @Nullable
    public String getUrl() {
        return null;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {

    }

    /**
     * @return the data
     */
    public int getData() {
        return 0;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {

    }

    /**
     * @return the durability
     */
    public int getDurability() {
        return 0;
    }

    /**
     * @param durability the durability to set
     */
    public void setDurability(int durability) {

    }

    /**
     * @return the potion
     */
    public Potion getPotion() {
        return null;
    }

    /**
     * @param potion the potion to set
     */
    public void setPotion(Potion potion) {

    }

    /**
     * @return the lore
     */
    public List<String> getLore() {
        return null;
    }

    /**
     * @param lore the lore to set
     */
    public void setLore(List<String> lore) {

    }

    /**
     * @return the flags
     */
    public List<ItemFlag> getFlags() {
        return null;
    }

    /**
     * @param flags the flags to set
     */
    public void setFlags(List<ItemFlag> flags) {

    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return null;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {

    }

    /**
     * @return the isGlowing
     */
    public boolean isGlowing() {
        return false;
    }

    /**
     * @param isGlowing the isGlowing to set
     */
    public void setGlowing(boolean isGlowing) {

    }

    /**
     * @return the modelID
     */
    public String getModelID() {
        return null;
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
     * @return the enchantments
     */
    public Map<Enchantment, Integer> getEnchantments() {
        return null;
    }

    /**
     * @param enchantments the enchantments to set
     */
    public void setEnchantments(Map<Enchantment, Integer> enchantments) {

    }

    /**
     * @return the attributes
     */
    public List<IAttribute> getAttributes() {
        return null;
    }

    /**
     * @param attributes the attributes to set.
     */
    public void setAttributes(List<IAttribute> attributes) {

    }

    /**
     * @return the banner
     */
    public Banner getBanner() {
        return null;
    }

    /**
     * @param banner the banner to set
     */
    public void setBanner(Banner banner) {

    }

    /**
     * @return the firework
     */
    public Firework getFirework() {
        return null;
    }

    /**
     * @param firework the firework to set
     */
    public void setFirework(Firework firework) {

    }

    /**
     * @return the leather armor
     */
    public LeatherArmor getLeatherArmor() {
        return null;
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

    public int parseAmount(Player player) {
        return 0;
    }

    public int parseAmount(Player player, Placeholders placeholders) {
        return 0;
    }

    public void setNeedPlaceholderAPI(boolean needPlaceholderAPI) {

    }

}
