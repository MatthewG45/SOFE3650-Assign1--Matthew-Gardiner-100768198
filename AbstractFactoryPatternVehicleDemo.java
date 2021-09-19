import java.io.FileNotFoundException;

public class AbstractFactoryPatternVehicleDemo {
    public static void main(String[] args) throws FileNotFoundException{

        AbstractFactoryVehicle OtherVehicleFactory = FactoryProducerVehicle.getFactory(true);
        AbstractFactoryVehicle VehicleFactory = FactoryProducerVehicle.getFactory(false);


        Vehicle vehicle1 = VehicleFactory.getVehicle("CAR");
        vehicle1.draw();
        
        Vehicle vehicle2 = VehicleFactory.getVehicle("TRUCK");
        vehicle2.draw();

        
        Vehicle vehicle3 = OtherVehicleFactory.getVehicle("SUV");
        vehicle3.draw();
        
        Vehicle vehicle4 = OtherVehicleFactory.getVehicle("SEMITRUCK");
        vehicle4.draw();
    }
}
