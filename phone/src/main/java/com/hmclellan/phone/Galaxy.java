package com.hmclellan.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return String.format("Your Galaxy %s sounds like %s.", getVersionNumber(), getRingTone());
    }
    @Override
    public String unlock() {
        return "'Good day!' Bixby says to you. 'Your phone is now unlocked'";
    }
    @Override
    public void displayInfo() {
        System.out.println(String.format("Your Galaxy %s's carrier is %s.", getVersionNumber(), getCarrier()));
    }
}


