import { Vehicle } from './Vehicle';

export class PickUpTruck extends Vehicle {
  public constructor(
    public cylinderCapacity: number,
    public modelYear: number,
    public valuation: number,
  ) {
    super(cylinderCapacity, modelYear, valuation);
  }
  private currentDate: Date = new Date();

  calculateRegistrationCost() {
    let cost = 0;
    const currentYear = this.currentDate.getFullYear();
    const vehicleYears = currentYear - this.modelYear;
    const vehicleCurrentValue = this.valuation * (1 - vehicleYears * 0.25);

    cost = vehicleCurrentValue * (this.cylinderCapacity / 10000);
    if (cost > 0.4 * this.valuation) {
      cost = 0.4 * this.valuation;
    }
    if (cost < 0.1 * this.valuation) {
      cost = 0.1 * this.valuation;
    }
    return cost;
  }
}