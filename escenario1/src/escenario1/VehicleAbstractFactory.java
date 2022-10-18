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
abstract class VehicleAbstractFactory {
    abstract Vehicle createVehicle(VehicleType vehicletype, int cylinderCapacity, int modelYear, double valuation);
}
