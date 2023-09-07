package org.launchcode;

public class DVD extends BaseDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + MINIMUM_DVD_RPM + " - " + MAXIMUM_DVD_RPM + " rpm.");
    }

    @Override
    public void storeData(String data) {
        setContents(data);
    }

    @Override
    public String readData() {
        return getContents();
    }

    @Override
    public String getDiscType() {
        return "DVD";
    }

    @Override
    public void destroyMicrowave() {

    }
}
