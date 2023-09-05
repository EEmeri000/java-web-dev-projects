package technology;

public class SmartPhone extends Computer{
    private String operatingSystem; // Additional property

    SmartPhone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    String getOperatingSystem() {
        return operatingSystem;
    }

    Object makeCall(String number) { // Additional method
        System.out.println("Calling " + number + " from your smartphone.");
        return null;
    }
}
