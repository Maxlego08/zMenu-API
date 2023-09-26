package fr.maxlego08.menu.button;

import fr.maxlego08.menu.api.action.permissible.PermissionPermissible;
import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.menu.api.button.PermissibleButton;
import fr.maxlego08.menu.inventory.inventories.InventoryDefault;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class ZPermissibleButton extends ZPerformButton implements PermissibleButton {

    private PermissionPermissible permission;
    private final List<PermissionPermissible> permissions = new ArrayList<>();
    private final List<PermissionPermissible> orPermissions = new ArrayList<>();
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
    public PermissionPermissible getPermission() {
        return this.permission;
    }

    /**
     * @param permission the permission to set
     */
    public ZPermissibleButton setPermission(String permission) {
        return this;
    }

    @Override
    public boolean hasPermission() {
        return this.permission.getPermission() != null || !this.permissions.isEmpty() || !this.orPermissions.isEmpty();
    }

    @Override
    public boolean hasElseButton() {
        return this.elseButton != null;
    }

    @Override
    public boolean checkPermission(Player player, InventoryDefault inventory) {

        if (!this.orPermissions.isEmpty()) {
            return this.orPermissions.stream().anyMatch(p -> p.hasPermission(player));
        }

        if (!this.permissions.isEmpty()) {
            return this.permissions.stream().allMatch(p -> p.hasPermission(player));
        }

        return permission != null && permission.hasPermission(player);
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
        return this.orPermissions;
    }

    @Override
    public List<PermissionPermissible> getPermissions() {
        return this.permissions;
    }

    public void setPermissions(List<String> permissions) {

    }

    public void setOrPermissions(List<String> orPermissions) {

    }
}
