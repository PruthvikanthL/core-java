package com.interfaceusing.using.external;

import com.interfaceusing.using.internal.interimple.AlramVibration;

public class MIAlarm implements AlramVibration {
    @Override
    public void usbcharging() {
        System.out.println("Running usbcharging method in MIAlarm class");
    }

    @Override
    public void bluetooth() {
        System.out.println("Running the bluetooth in MIAlarm class");
    }

    @Override
    public void tempdisp() {
        System.out.println("Running the tempdisp in MIAlarm class");
    }

    @Override
    public void material() {
        System.out.println("Running the material in MIAlarm class");
    }

    @Override
    public void alarmdisp() {
        System.out.println("Running the alarmdisp in MIAlarm class");
    }

    @Override
    public void hourformate() {
        System.out.println("Running the hourformate in MIAlarm class");
    }

    @Override
    public void alramwight() {
        System.out.println("Running the alramwight in MIAlarm class");
    }

    @Override
    public void alramcolor() {
        System.out.println("Running the alramcolor in MIAlarm class");
    }

    @Override
    public void alramshape() {
        System.out.println("Running the alramshape in MIAlarm class");
    }

    @Override
    public void display() {
        System.out.println("Running the display in MIAlarm class");
    }

    @Override
    public void batterybackup() {
        System.out.println("Running the batterybackup method in MIAlarm class");
    }

    @Override
    public void powersource() {
        System.out.println("Running the powersource method in the MIAlarm class");
    }

    @Override
    public void Timedisplay() {
        System.out.println("Running the timedisplay method in the MIAlarm class");
    }

    @Override
    public void Volumecontrol() {
        System.out.println("Running the volumecontrol method in the MIAlarm class");
    }

    @Override
    public void Snooze() {
        System.out.println("Running the snooze method in tht MIAlarm class");
    }
}
