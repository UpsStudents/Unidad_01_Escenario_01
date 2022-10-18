/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escenario1;

/**
 *
 * @author Dell
 */
public class VehicleController {
   private final VehicleFactoryService service =new VehicleFactoryService();
    
    public Vehicle create(VehicleType vehicletype, int cylinderCapacity, int modelYear, double valuation ){
       return service.createVehicle(vehicletype, cylinderCapacity, modelYear, valuation);
    }
    
}
