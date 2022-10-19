import { Vehicle } from './Vehicle';
import { VehicleType } from './VehicleType';

export abstract class VehicleAbstractFactory {
  abstract createVehicle(
    vehicletype: VehicleType,
    cylinderCapacity: number,
    modelYear: number,
    valuation: number,
  ): Vehicle;
}
