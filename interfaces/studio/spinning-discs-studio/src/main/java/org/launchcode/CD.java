package org.launchcode;

public class CD extends BaseDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + MINIMUM_CD_RPM + " - " + MAXIMUM_CD_RPM + " rpm.");
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
        return "CD";
    }

    @Override
    public void destroyMicrowave() {

    }
}
