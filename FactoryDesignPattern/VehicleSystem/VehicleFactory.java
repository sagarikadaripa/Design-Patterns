package FactoryDesignPattern.VehicleSystem;

public class VehicleFactory {
    public Vehicle getVehicleType(String vehicleType){
        if(vehicleType == null || vehicleType.isEmpty())    return null;
        switch(vehicleType){
            case "CAR": return new Car();
            case "BIKE": return new Bike();
            default: throw new IllegalArgumentException("Unknown Vehicle Type " + vehicleType);
        }
    }
}
