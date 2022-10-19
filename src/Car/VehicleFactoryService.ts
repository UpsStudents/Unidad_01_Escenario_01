import { Vehicle } from './Vehicle';
import { VehicleType } from './VehicleType';
import { Car } from './Car';
import { Truck } from './Truck';
import { PickUpTruck } from './PickUpTruck';
import { VehicleAbstractFactory } from './VehicleAbstractFactory';

export class VehicleFactoryService extends VehicleAbstractFactory {
  public vehicles: Vehicle[];

  createVehicle(
    vehicletype: VehicleType,
    cylinderCapacity: number,
    modelYear: number,
    valuation: number,
  ): Vehicle {
    switch (vehicletype) {
      case VehicleType.CAR:
        return new Car(cylinderCapacity, modelYear, valuation);
      case VehicleType.TRUCK:
        return new Truck(cylinderCapacity, modelYear, valuation);
      case VehicleType.PICKUPTRUCK:
        return new PickUpTruck(cylinderCapacity, modelYear, valuation);
      default:
        console.error('No existe vehiculo');
    }
  }
}
