package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void printMenuItem() {
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("New Item: " + isNew);
    }
    public boolean equals(MenuItem otherItem) {
        if (otherItem == this) {
            return true;
        }

        if (otherItem == null) {
            return false;
        }

        if (otherItem.getClass() != getClass()) {
            return false;
        }
        return this.description.equals(otherItem.description)
                && this.category.equals(otherItem.category)
                && this.price == otherItem.price;
    }
    public boolean isNewItem() {
        return isNew;
    }
}

