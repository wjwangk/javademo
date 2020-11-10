package com.javaplan.object.duotai;
// https://blog.csdn.net/lovejojo222/article/details/103610926
public class VehicleMain {

    public static void main(String[] args) {

        Vehicle vehicle = new Transport();
        vehicle.run();
        ((Transport) vehicle).goHome();
    }
}
