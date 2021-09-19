public class VehicleFactory extends AbstractFactoryVehicle {
    @Override
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }else if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        return null;
    }
}
