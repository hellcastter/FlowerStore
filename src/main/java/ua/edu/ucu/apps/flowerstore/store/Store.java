package ua.edu.ucu.apps.flowerstore.store;

import java.util.ArrayList;
import java.util.List;

import ua.edu.ucu.apps.flowerstore.filters.Filter;
import ua.edu.ucu.apps.flowerstore.flowers.Item;


public class Store {
    private List<Item> items;

    public List<Item> search(Filter filter) {
        List<Item> foundItems = new ArrayList<>();

        for (Item item : items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }

        return foundItems;
    }
}
