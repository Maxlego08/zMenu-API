package fr.maxlego08.menu.api.action.permissible;

import org.bukkit.Material;

public interface ItemPermissible extends Permissible {

    /**
     * The material that the player must have
     *
     * @return material
     */
    Material getMaterial();

    /**
     * The number of items that the player must have at least, put 0 to not check
     *
     * @return amount
     */
    int getAmount();

}
