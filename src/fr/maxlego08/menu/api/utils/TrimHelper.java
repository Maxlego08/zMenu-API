package fr.maxlego08.menu.api.utils;

import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

import java.util.HashMap;
import java.util.Map;

public class TrimHelper {

    private final Map<String, TrimMaterial> trimMaterials = new HashMap<>();
    private final Map<String, TrimPattern> trimPatterns = new HashMap<>();

    public TrimHelper() {
    }

    public Map<String, TrimMaterial> getTrimMaterials() {
        return trimMaterials;
    }

    public Map<String, TrimPattern> getTrimPatterns() {
        return trimPatterns;
    }
}
