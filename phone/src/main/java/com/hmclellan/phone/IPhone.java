package com.hmclellan.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return String.format("Your iPhone %s sounds like %s.", getVersionNumber(), getRingTone());
    }
    @Override
    public String unlock() {
        return "'Hi there!' Siri says to you. 'Your phone is now unlocked'";
    }
    @Override
    public void displayInfo() {
        System.out.println(String.format("Your iPhone %s's carrier is %s.", getVersionNumber(), getCarrier()));
    }
}