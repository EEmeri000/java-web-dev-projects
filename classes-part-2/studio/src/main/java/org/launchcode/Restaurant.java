package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem(10.99, "Chicken Wings", "Appetizer", true));
        menuItems.add(new MenuItem(15.99, "Steak", "Main Course", false));
        menuItems.add(new MenuItem(7.99, "Chocolate Cake", "Dessert", true));

        Menu menu = new Menu(new Date(), menuItems);

        System.out.println("Current Menu:");
        for (MenuItem item : menu.getItems()) {
            item.printMenuItem();
            System.out.println();
        }

        System.out.println("Individual Menu Item:");
        MenuItem singleItem = menu.getItems().get(0);
        singleItem.printMenuItem();

        menu.removeItem(singleItem);

        System.out.println("Updated Menu:");
        for (MenuItem item : menu.getItems()) {
            item.printMenuItem();
            System.out.println();
        }

        // Bonus Mission: Adding a duplicate item
        MenuItem duplicateItem = new MenuItem(15.99, "Steak", "Main Course", false);
        if (!menu.getItems().contains(duplicateItem)) {
            menu.addItem(duplicateItem);
        } else {
            System.out.println("Warning: Item already exists on the menu!");
        }
    }
}
