package org.launchcode;

public interface OpticalDisc {
    int MINIMUM_CD_RPM = 200;
    int MAXIMUM_CD_RPM = 500;
    int MINIMUM_DVD_RPM = 570;
    int MAXIMUM_DVD_RPM = 1600;

    void spinDisc();

    void storeData(String data);

    String readData();

    String getDiscType();

    String getName();

    int getCapacity();

    void destroyMicrowave();
}
