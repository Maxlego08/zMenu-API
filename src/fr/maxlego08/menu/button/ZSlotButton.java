package fr.maxlego08.menu.button;

import fr.maxlego08.menu.api.button.SlotButton;

import java.util.Collection;
import java.util.List;

public abstract class ZSlotButton implements SlotButton {

    protected List<Integer> slots;

    @Override
    public Collection<Integer> getSlots() {
        return this.slots;
    }

    /**
     * @param slots the slots to set
     */
    public void setSlots(List<Integer> slots) {
        this.slots = slots;
    }

}
