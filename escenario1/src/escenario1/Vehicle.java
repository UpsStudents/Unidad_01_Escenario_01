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
abstract class Vehicle {
    
    protected int cylinderCapacity;
    protected int modelYear;
    protected double valuation;

    public Vehicle(int cylinderCapacity, int modelYear, double valuation) {
        this.cylinderCapacity = cylinderCapacity;
        this.modelYear = modelYear;
        this.valuation = valuation;
    }
            
    abstract double calculateRegistrationCost();
       
}
