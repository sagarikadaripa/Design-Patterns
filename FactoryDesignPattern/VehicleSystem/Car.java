package FactoryDesignPattern.VehicleSystem;

public class Car implements Vehicle{
    
    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
