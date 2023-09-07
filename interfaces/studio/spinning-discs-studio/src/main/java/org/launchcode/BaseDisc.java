package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    private String name;
    private int capacity;
    private String contents;


    public BaseDisc(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.contents = "";
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    public void reportInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Capacity: " + getCapacity() + " MB");
        System.out.println("Disc Type: " + getDiscType());
        System.out.println("Contents: " + getContents());
    }
}
