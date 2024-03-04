package fr.maxlego08.menu.zcore.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A utility class extending MessageUtils, providing various utility methods for
 * inventory management, number formatting, and randomization in a Minecraft plugin context.
 */
public abstract class ZUtils extends MessageUtils {

    /**
     * Calculates the inventory size based on a given matrix layout.
     *
     * @param matrix A list of strings representing the matrix.
     * @return The inventory size as an integer, maximum of 54 slots.
     */
    protected int getInventorySizeByMatrix(List<String> matrix) {
        return Math.min(matrix.size() * 9, 54);
    }

    /**
     * Generates a mapping of characters to their positions in a matrix layout.
     *
     * @param matrix A list of strings representing the matrix.
     * @return A map of characters to lists of integers representing their positions.
     */
    protected Map<Character, List<Integer>> generateMatrix(List<String> matrix) {
        Map<Character, List<Integer>> charMap = new HashMap<>();

        if (matrix == null || matrix.size() > 6) {
            return new HashMap<>();
        }
        for (String line : matrix) {
            if (line.length() > 9) {
                return new HashMap<>();
            }
        }

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < Math.min(matrix.get(i).length(), 9); j++) {
                char c = matrix.get(i).charAt(j);
                if (c != ' ') {
                    int slot = i * 9 + j;
                    charMap.computeIfAbsent(c, k -> new ArrayList<>()).add(slot);
                }
            }
        }

        return charMap;
    }

    /**
     * Returns a random number between two specified values.
     *
     * @param first  The lower bound.
     * @param second The upper bound.
     * @return A random integer between the specified bounds.
     */
    protected int getNumberBetween(int first, int second) {
        return ThreadLocalRandom.current().nextInt(first, second);
    }

    /**
     * Formats a decimal number to a string with two decimal places.
     *
     * @param decimal The decimal number to format.
     * @return The formatted string.
     */
    protected String format(double decimal) {
        return format(decimal, "#.##");
    }

    /**
     * Formats a decimal number using a specified format.
     *
     * @param decimal The decimal number to format.
     * @param format  The string format to use.
     * @return The formatted string.
     */
    protected String format(double decimal, String format) {
        DecimalFormat decimalFormat = new DecimalFormat(format);
        return decimalFormat.format(decimal);
    }

    /**
     * Calculates the maximum number of pages needed to display a collection of items,
     * assuming 45 items per page.
     *
     * @param items The collection of items.
     * @return The maximum number of pages as an integer.
     */
    protected int getMaxPage(Collection<?> items) {
        return (items.size() / 45) + 1;
    }

    /**
     * Calculates the maximum number of pages needed to display a collection of items,
     * with a custom number of items per page.
     *
     * @param items The collection of items.
     * @param size  The number of items per page.
     * @return The maximum number of pages as an integer.
     */
    protected int getMaxPage(Collection<?> items, int size) {
        return (items.size() / size) + 1;
    }

    /**
     * Calculates the percentage of a value relative to a total.
     *
     * @param value The value.
     * @param total The total.
     * @return The percentage as a double.
     */
    protected double percent(double value, double total) {
        return (value * 100) / total;
    }

    /**
     * Calculates the numerical value representing a specific percentage of a total.
     *
     * @param total   The total amount.
     * @param percent The percentage to calculate.
     * @return The calculated amount as a double.
     */
    protected double percentNum(double total, double percent) {
        return total * (percent / 100);
    }

    /**
     * Selects a random element from a list.
     *
     * @param <T>     The type of elements in the list.
     * @param element The list of elements.
     * @return A randomly selected element from the list.
     */
    protected <T> T randomElement(List<T> element) {
        if (element.size() == 0) return null;
        if (element.size() == 1) return element.get(0);
        Random random = new Random();
        return element.get(random.nextInt(element.size() - 1));
    }

    /**
     * Formats a long number as a string with a space as the grouping separator.
     *
     * @param l The long number to format.
     * @return The formatted string.
     */
    protected String format(long l) {
        return format(l, ' ');
    }

    /**
     * Formats a long number as a string with a specified character as the grouping separator.
     *
     * @param l The long number to format.
     * @param c The character to use as the grouping separator.
     * @return The formatted string.
     */
    protected String format(long l, char c) {
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        DecimalFormatSymbols symbols = formatter.getDecimalFormatSymbols();
        symbols.setGroupingSeparator(c);
        formatter.setDecimalFormatSymbols(symbols);
        return formatter.format(l);
    }

}
