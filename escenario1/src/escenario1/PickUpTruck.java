/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escenario1;

import java.time.LocalDate;

/**
 *
 * @author Dell
 */
public class PickUpTruck extends Vehicle {

    public PickUpTruck(int cylinderCapacity, int modelYear, double valuation) {
        super(cylinderCapacity, modelYear, valuation);
    }
    LocalDate currentDate = LocalDate.now();

    @Override
    double calculateRegistrationCost() {
        double cost = 0;
        int currentYear = currentDate.getYear();
        int vehicleYears = currentYear - modelYear;
        double vehicleCurrentValue = valuation * (1 - (vehicleYears * 0.25));

        cost = vehicleCurrentValue * ((double)cylinderCapacity / 10000);        
        if (cost > 0.4 * valuation) {
            cost = 0.4 * valuation;
        }
        if (cost < 0.1 * valuation) {
            cost = 0.1 * valuation;
        }
        return cost;
    }

}
