package technology;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ProgramTest {
    @Test
    void testComputer() {
        Computer computer = new Computer("HP", "Pavilion");

        // Test the ID functionality
        assertEquals(1, computer.getId());

        // Test the getBrand() method
        assertEquals("HP", computer.getBrand());

        // Test the getModel() method
        assertEquals("Pavilion", computer.getModel());
    }

    @Test
    void testLaptop() {
        Laptop laptop = new Laptop("Lenovo", "ThinkPad", 15);

        // Test the ID functionality
        assertEquals(2, laptop.getId());

        // Test the getScreenSize() method
        assertEquals(15, laptop.getScreenSize());

        // Test the openLid() method
        assertEquals("Laptop lid is opened.", laptop.openLid());
    }

    @Test
    void testSmartPhone() {
        SmartPhone phone = new SmartPhone("Samsung", "Galaxy S21", "Android");

        // Test the ID functionality
        assertEquals(3, phone.getId());

        // Test the getOperatingSystem() method
        assertEquals("Android", phone.getOperatingSystem());

        // Test the makeCall() method
        assertEquals("Calling 123-456-7890 from your smartphone.", phone.makeCall("123-456-7890"));
    }
}
