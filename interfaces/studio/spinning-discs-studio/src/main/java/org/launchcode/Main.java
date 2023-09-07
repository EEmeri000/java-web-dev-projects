package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD myCd = new CD("My CD", 700);
        DVD myDvd = new DVD("My DVD", 4700);


        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.storeData("CD Data");
        myDvd.storeData("DVD Data");

        System.out.println("CD Contents: " + myCd.readData());
        System.out.println("DVD Contents: " + myDvd.readData());

        myCd.reportInfo();
        myDvd.reportInfo();
    }
}