/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escenario1;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class VehicleFactoryService extends VehicleAbstractFactory{

    ArrayList<Vehicle> vehicles = new ArrayList(); 
      
     
    @Override
    Vehicle createVehicle(VehicleType vehicletype, int cylinderCapacity, int modelYear, double valuation ) {
         switch(vehicletype){
             case CAR:
                 return new Car(cylinderCapacity, modelYear, valuation);
             case TRUCK:
                 return new Truck(cylinderCapacity, modelYear, valuation);
             case PICKUPTRUCK:
                 return new PickUpTruck(cylinderCapacity, modelYear, valuation);
             default:
                 throw new IllegalArgumentException("No existe vehiculo");            
        }
    }
    
}
