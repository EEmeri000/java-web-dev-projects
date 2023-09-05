package technology;

public class Laptop extends Computer{
    private int screenSize; // Additional property

    Laptop(String brand, String model, int screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    int getScreenSize() {
        return screenSize;
    }

    Object openLid() { // Additional method
        System.out.println("Laptop lid is opened.");
        return null;
    }
}
