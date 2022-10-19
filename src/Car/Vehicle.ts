export abstract class Vehicle {
  protected cylinderCapacity: number;
  protected modelYear: number;
  protected valuation: number;

  public constructor(
    cylinderCapacity: number,
    modelYear: number,
    valuation: number,
  ) {
    this.cylinderCapacity = cylinderCapacity;
    this.modelYear = modelYear;
    this.valuation = valuation;
  }

  abstract calculateRegistrationCost(): number;
}
