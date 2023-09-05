package technology;

public class Program {
    public static void main(String[] args) {
        // Test the classes
        Laptop laptop = new Laptop("Dell", "XPS 13", 13);
        SmartPhone phone = new SmartPhone("Apple", "iPhone 12", "iOS");

        System.out.println("Laptop ID: " + laptop.getId());
        System.out.println("Brand: " + laptop.getBrand());
        System.out.println("Screen Size: " + laptop.getScreenSize());
        laptop.turnOn();
        laptop.openLid();

        System.out.println("\nSmartphone ID: " + phone.getId());
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Operating System: " + phone.getOperatingSystem());
        phone.turnOn();
        phone.makeCall("123-456-7890");
    }
}
