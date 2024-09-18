package fr.maxlego08.menu.zcore.utils;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionBrewer;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionType;

import java.util.Collection;

/**
 * Potion Adapter for pre-1.9 data values see @PotionMeta for 1.9+
 */

public class Potion {
    private static final int EXTENDED_BIT = 0x40;
    private static final int POTION_BIT = 0xF;
    private static final int SPLASH_BIT = 0x4000;
    private static final int TIER_BIT = 0x20;
    private static final int TIER_SHIFT = 5;
    private static PotionBrewer brewer;
    private boolean extended = false;
    private boolean splash = false;
    private int level = 1;
    private PotionType type;
    private Color color;

    /**
     * Construct a new potion of the given type. Unless the type is
     * {@link PotionType#WATER}, it will be level one, without extended
     * duration. Don't use this constructor to create a no-effect potion other
     * than water bottle.
     *
     * @param type The potion type
     */
    public Potion(PotionType type) {
        this.type = type;
    }

    /**
     * Create a new potion of the given type and level.
     *
     * @param type  The type of potion.
     * @param level The potion's level.
     */
    public Potion(PotionType type, int level) {
        this(type);
        this.level = level;
    }

    /**
     * Create a new potion of the given type and level.
     *
     * @param type   The type of potion.
     * @param level  The potion's level.
     * @param splash Whether it is a splash potion. In favour of using
     *               {@link #Potion(PotionType)} with {@link #splash()}.
     */

    public Potion(PotionType type, int level, boolean splash) {
        this(type, level);
        this.splash = splash;
    }

    /**
     * Create a new potion of the given type and level.
     *
     * @param type     The type of potion.
     * @param level    The potion's level.
     * @param splash   Whether it is a splash potion.
     * @param extended Whether it has an extended duration. In favour of using
     *                 {@link #Potion(PotionType)} with {@link #extend()} and
     *                 possibly {@link #splash()}.
     */

    public Potion(PotionType type, int level, boolean splash, boolean extended) {
        this(type, level, splash);
        this.extended = extended;
    }

    /**
     * Gets the potion from its damage value.
     *
     * @param damage the damage value
     * @return the produced potion
     */

    public static Potion fromDamage(int damage) {
        return null;
    }

    /**
     * Returns an instance of {@link PotionBrewer}.
     *
     * @return An instance of PotionBrewer
     */

    public static PotionBrewer getBrewer() {
        return brewer;
    }

    /**
     * Sets the current instance of {@link PotionBrewer}. Generally not to be
     * used from within a plugin.
     *
     * @param other The new PotionBrewer
     */
    public static void setPotionBrewer(PotionBrewer other) {
        if (brewer != null)
            throw new IllegalArgumentException("brewer can only be set internally");
        brewer = other;
    }

    /**
     * Chain this to the constructor to make the potion a splash potion.
     *
     * @return The potion.
     */

    public Potion splash() {
        setSplash(true);
        return this;
    }

    /**
     * Chain this to the constructor to extend the potion's duration.
     *
     * @return The potion.
     */

    public Potion extend() {
        setHasExtendedDuration(true);
        return this;
    }

    /**
     * Applies the effects of this potion to the given {@link ItemStack}. The
     * ItemStack must be a potion.
     *
     * @param to The itemstack to apply to
     */
    public void apply(ItemStack to) {

    }

    /**
     * Applies the effects that would be applied by this potion to the given
     * {@link LivingEntity}.
     *
     * @param to The entity to apply the effects to
     * @see LivingEntity#addPotionEffects(Collection)
     */
    public void apply(LivingEntity to) {
        to.addPotionEffects(getEffects());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Potion other = (Potion) obj;
        return extended == other.extended && splash == other.splash && level == other.level && type == other.type;
    }

    /**
     * Returns a collection of {@link PotionEffect}s that this {@link Potion}
     * would confer upon a {@link LivingEntity}.
     *
     * @return The effects that this potion applies
     * @see PotionBrewer#getEffectsFromDamage(int)
     * @see Potion#toDamageValue()
     */

    public Collection<PotionEffect> getEffects() {
        return getBrewer().getEffects(type, level == 2, extended);
    }

    /**
     * Returns the level of this potion.
     *
     * @return The level of this potion
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the level of this potion.
     *
     * @param level The new level of this potion
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Returns the {@link PotionType} of this potion.
     *
     * @return The type of this potion
     */

    public PotionType getType() {
        return type;
    }

    /**
     * Sets the {@link PotionType} of this potion.
     *
     * @param type The new type of this potion
     */
    public void setType(PotionType type) {
        this.type = type;
    }

    /**
     * Returns the {@link Color} of this potion.
     *
     * @return The color of this potion
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the {@link Color} of this potion
     *
     * @param color The new color of this potion.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Returns whether this potion has an extended duration.
     *
     * @return Whether this potion has extended duration
     */
    public boolean hasExtendedDuration() {
        return extended;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + level;
        result = prime * result + (extended ? 1231 : 1237);
        result = prime * result + (splash ? 1231 : 1237);
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    /**
     * Returns whether this potion is a splash potion.
     *
     * @return Whether this is a splash potion
     */
    public boolean isSplash() {
        return splash;
    }

    /**
     * Sets whether this potion is a splash potion. Splash potions can be thrown
     * for a radius effect.
     *
     * @param isSplash Whether this is a splash potion
     */
    public void setSplash(boolean isSplash) {
        splash = isSplash;
    }

    /**
     * Set whether this potion has extended duration. This will cause the potion
     * to have roughly 8/3 more duration than a regular potion.
     *
     * @param isExtended Whether the potion should have extended duration
     */
    public void setHasExtendedDuration(boolean isExtended) {
        extended = isExtended;
    }

    /**
     * Converts this potion to a valid potion damage short, usable for potion
     * item stacks.
     *
     * @return The damage value of this potion Non-functional
     */

    public short toDamageValue() {
        return 0;
    }

    /**
     * Converts this potion to an {@link ItemStack} with the specified amount
     * and a correct damage value.
     *
     * @param amount The amount of the ItemStack
     * @return The created ItemStack
     */

    public ItemStack toItemStack(int amount) {
        Material material;
        if (isSplash()) {
            material = Material.SPLASH_POTION;
        } else {
            material = Material.POTION;
        }
        ItemStack itemStack = new ItemStack(material, amount);
        PotionMeta meta = (PotionMeta) itemStack.getItemMeta();
        meta.setBasePotionData(new PotionData(type, level == 2, extended));
        if (color != null) meta.setColor(color);
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    /**
     * Gets the potion from its name id.
     *
     * @return the name id Non-functional
     */

    public int getNameId() {
        return 0;
    }
}
