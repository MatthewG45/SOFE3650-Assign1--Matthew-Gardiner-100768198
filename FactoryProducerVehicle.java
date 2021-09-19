public class FactoryProducerVehicle {
    public static AbstractFactoryVehicle getFactory(boolean rounded){
        if(rounded){
            return new OtherVehicleFactory();
        }else{
            return new VehicleFactory();
        }
    }
}
