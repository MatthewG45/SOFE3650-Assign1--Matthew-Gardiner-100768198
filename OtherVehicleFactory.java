public class OtherVehicleFactory extends AbstractFactoryVehicle {
    @Override
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("SUV")){
            return new SUV();
        }else if(vehicleType.equalsIgnoreCase("SEMITRUCK")){
            return new SemiTruck();
        }
        return null;
    }
}
