package fr.maxlego08.menu.button;

import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.PermissibleButton;
import fr.maxlego08.menu.api.requirement.permissible.PermissionPermissible;
import fr.maxlego08.menu.inventory.inventories.InventoryDefault;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class ZPermissibleButton extends ZPerformButton implements PermissibleButton {

    private Button elseButton;
    private Button parentButton;

    @Override
    public Button getElseButton() {
        return this.elseButton;
    }

    /**
     * @param elseButton the elseButton to set
     */
    public ZPermissibleButton setElseButton(Button elseButton) {
        this.elseButton = elseButton;
        return this;
    }

    @Override
    public boolean hasPermission() {
        return false;
    }

    @Override
    public boolean hasElseButton() {
        return this.elseButton != null;
    }

    @Override
    public boolean checkPermission(Player player, InventoryDefault inventory) {
        return true;
    }

    @Override
    public Button getParentButton() {
        return this.parentButton;
    }

    /**
     * @param parentButton The parent button
     * @return button
     */
    public ZPermissibleButton setParentButton(Button parentButton) {
        this.parentButton = parentButton;
        return this;
    }

    @Override
    public Button getMasterParentButton() {
        Button button = this.getParentButton();
        return button == null ? (Button) this : button.getMasterParentButton();
    }

    @Override
    public List<PermissionPermissible> getOrPermission() {
        return null;
    }

    @Override
    public List<PermissionPermissible> getPermissions() {
        return null;
    }

    public void setPermissions(List<String> permissions, String permission) {
    }

    public void setOrPermissionsString(List<String> orPermissions) {
    }

    public void setPermissions(List<PermissionPermissible> permissions) {

    }

    public void setOrPermissions(List<PermissionPermissible> orPermissions) {

    }
}
