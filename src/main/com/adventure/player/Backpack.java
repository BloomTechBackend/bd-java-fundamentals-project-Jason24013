package main.com.adventure.player;

import main.com.adventure.world.objects.Tangible;
import org.apache.commons.lang3.ArrayUtils;



/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {
     private static final int MAX_CAPACITY = 5;

    private final Tangible[] items = new Tangible[MAX_CAPACITY];


    /**
     * Adds an item to the backpack array only if there's an empty space in the array.
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    @SuppressWarnings("checkstyle:Indentation")
    public boolean addItem(Tangible item) {
        //TODO Complete the function

        for (int i = 0; i < items.length; i++) {
        for (Tangible tangible : items) {
            tangible = item;
            items[i] = tangible;
            tangible.useItem(item);
            if (tangible.canUse(item)) {
                return tangible.canTake();
            }
        }}
        return false;
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            for (Tangible tangible : items) {


            if (tangible.getName().length() == name.length()) {
                return tangible;

            }


        }}
        return null;

    }

    /**
     * Checks if the given item exists in the backpack based on the item's name, and removes the item if it's found.
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        //TODO Complete the function
        for (int i = 0; i < items.length; i++) {
            for (Tangible tangible: items) {
            int index = 2;
                tangible = item;
                items[0] = tangible;
                tangible = items[0];
            if (tangible.canUse(item))
           {
                return tangible.canTake();
           }
        }}
        return false;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     *
     *          "Here are the items in your backpack:"
     *
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        //TODO Complete the function
    }
}
