package fr.maxlego08.menu.inventory;

import fr.maxlego08.menu.zcore.utils.inventory.ItemButton;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public abstract class VInventory implements Cloneable, InventoryHolder {

    @Override
    public Inventory getInventory() {
        return null;
    }

    public boolean isClose() {
        return false;
    }

    public int getId() {
        return 0;
    }

    public ItemButton addItem(int slot, ItemStack item) {
        return null;
    }

    /**
     * Allows you to remove an item from the list of items
     *
     * @param slot
     */
    public void removeItem(int slot) {

    }

    /**
     * Allows you to delete all items
     */
    public void clearItem() {

    }

    /**
     * Allows you to retrieve all items
     *
     * @return
     */
    public Map<Integer, ItemButton> getItems() {
        return null;
    }

    /**
     * If the click in the inventory is disabled (which is the default)
     * then it will return true
     *
     * @return vrai ou faux
     */
    public boolean isDisableClick() {
        return false;
    }

    /**
     * Allows to recover the player
     *
     * @return player
     */
    public Player getPlayer() {
        return null;
    }

    /**
     * Allows you to retrieve the page
     *
     * @return the page
     */
    public int getPage() {
        return 0;
    }

    /**
     * @return the args
     */
    public Object[] getArgs() {
        return null;
    }

    /**
     * @return the inventory
     */
    public Inventory getSpigotInventory() {
        return null;
    }

    /**
     * @return the guiName
     */
    public String getGuiName() {
        return null;
    }

}
