package fr.maxlego08.menu.inventory.inventories;

import fr.maxlego08.menu.api.Inventory;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.inventory.VInventory;

import java.util.List;

public class InventoryDefault extends VInventory {

    public Inventory getMenuInventory() {
        return null;
    }

    /**
     * @return the oldInventories
     */
    public List<Inventory> getOldInventories() {
        return null;
    }

    /**
     * @return the maxPage
     */
    public int getMaxPage() {
        return 0;
    }

    public List<Button> getButtons() {
        return null;
    }

    public void buildButton(Button button) {

    }

}
