package fr.maxlego08.menu.button.buttons;

import fr.maxlego08.menu.api.button.buttons.InventoryButton;
import fr.maxlego08.menu.button.ZButton;

import java.util.List;

public class ZInventoryButton extends ZButton implements InventoryButton {

    @Override
    public String getInventory() {
        return null;
    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public int getToPage() {
        return 0;
    }
}
