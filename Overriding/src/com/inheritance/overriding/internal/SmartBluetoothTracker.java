package com.inheritance.overriding.internal;

public class SmartBluetoothTracker extends BluetoothTracker{
    public SmartBluetoothTracker(){
        System.out.println("Runnnig the SmartBluetoothTracker const");
    }
    public void showblue(BluetoothTracker bluetoothTracker){
        if(bluetoothTracker!=null){
            bluetoothTracker.useblue();
            if(bluetoothTracker instanceof ProBluetoothTracker){
                ProBluetoothTracker blue=(ProBluetoothTracker) bluetoothTracker;
                blue.mainblue();
            }
            else{
                System.out.println("in bluetoothtracker ProBluetoothTracker is not found");
            }
        }else{
            System.out.println("smartblutooth is null");
        }
    }
}
