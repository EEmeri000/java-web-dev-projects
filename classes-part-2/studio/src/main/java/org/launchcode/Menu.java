package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    // Method to add a MenuItem to the menu
    public void addItem(MenuItem newItem) {
        items.add(newItem);
        lastUpdated = new Date(); // Update lastUpdated when a new item is added
    }

    // Method to remove a MenuItem from the menu
    public void removeItem(MenuItem itemToRemove) {
        items.remove(itemToRemove);
        lastUpdated = new Date(); // Update lastUpdated when an item is removed
    }
}


