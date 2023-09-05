package technology;

public class Computer extends AbstractEntity{
    private String brand;
    private String model;

    Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    void turnOn() {
        System.out.println("Computer is powering on.");
    }
}
