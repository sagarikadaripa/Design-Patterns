package FactoryDesignPattern.VehicleSystemMain;

import java.util.Scanner;

import FactoryDesignPattern.VehicleSystem.Vehicle;
import FactoryDesignPattern.VehicleSystem.VehicleFactory;

public class VehicleService {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the vehicle type = ");
        String vehicleType = scanner.next();
        VehicleFactory vehicleF = new VehicleFactory();
        Vehicle vehicle = vehicleF.getVehicleType(vehicleType);
        System.out.println(vehicle.getNumberOfWheels());
    }
}
