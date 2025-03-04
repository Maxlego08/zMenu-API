package fr.maxlego08.menu;

import fr.maxlego08.menu.api.InventoryManager;
import fr.maxlego08.menu.api.attribute.IAttribute;
import fr.maxlego08.menu.api.enums.MenuItemRarity;
import fr.maxlego08.menu.api.itemstack.TrimConfiguration;
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
import java.io.File;
import java.util.List;
import java.util.Map;

public class MenuItemStack {

    public MenuItemStack(InventoryManager inventoryManager, String filePath, String path) {
    }


    public static MenuItemStack fromItemStack(InventoryManager manager, ItemStack itemStack) {
        return null;
    }

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

    public Map<String, String> getTranslatedDisplayName() {
        return null;
    }

    public void setTranslatedDisplayName(Map<String, String> translatedDisplayName) {

    }

    public Map<String, List<String>> getTranslatedLore() {
        return null;
    }

    public void setTranslatedLore(Map<String, List<String>> translatedLore) {

    }

    public boolean isNeedPlaceholderAPI() {
        return false;
    }

    public void setNeedPlaceholderAPI(boolean needPlaceholderAPI) {

    }

    public ItemStack getCacheItemStack() {
        return null;
    }

    public void setCacheItemStack(ItemStack cacheItemStack) {

    }

    public int getMaxStackSize() {
        return 0;
    }

    public void setMaxStackSize(int maxStackSize) {

    }

    public int getMaxDamage() {
        return 0;
    }

    public void setMaxDamage(int maxDamage) {

    }

    public int getDamage() {
        return 0;
    }

    public void setDamage(int damage) {

    }

    public int getRepairCost() {
        return 0;
    }

    public void setRepairCost(int repairCost) {

    }

    public boolean isUnbreakableEnabled() {
        return false;
    }

    public void setUnbreakableEnabled(Boolean unbreakableEnabled) {

    }

    public boolean isUnbreakableShowInTooltip() {
        return false;
    }

    public void setUnbreakableShowInTooltip(Boolean unbreakableShowInTooltip) {

    }

    public boolean isFireResistant() {
        return false;
    }

    public void setFireResistant(Boolean fireResistant) {

    }

    public boolean isHideTooltip() {
        return false;
    }

    public void setHideTooltip(Boolean hideTooltip) {

    }

    public boolean isHideAdditionalTooltip() {
        return false;
    }

    public void setHideAdditionalTooltip(Boolean hideAdditionalTooltip) {

    }

    public boolean isEnchantmentGlint() {
        return false;
    }

    public void setEnchantmentGlint(Boolean enchantmentGlint) {

    }

    public boolean isEnchantmentShowInTooltip() {
        return false;
    }

    public void setEnchantmentShowInTooltip(Boolean enchantmentShowInTooltip) {

    }

    public boolean isAttributeShowInTooltip() {
        return false;
    }

    public void setAttributeShowInTooltip(Boolean attributeShowInTooltip) {

    }

    public MenuItemRarity getItemRarity() {
        return null;
    }

    public void setItemRarity(MenuItemRarity itemRarity) {

    }

    public TrimConfiguration getTrimConfiguration() {
        return null;
    }

    public void setTrimConfiguration(TrimConfiguration trimConfiguration) {

    }

    public static MenuItemStack fromMap(InventoryManager inventoryManager, File file, String path, Map<String, Object> map) {
        return null;
    }
}
