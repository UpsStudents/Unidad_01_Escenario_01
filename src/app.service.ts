import { Injectable } from '@nestjs/common';
import { DataSource, EntityManager } from 'typeorm';
import { Car } from './Car/Car';
import { Truck } from './Car/Truck';
import { PickUpTruck } from './Car/PickUpTruck';
import { Vehicle as VehicleModel } from './Models/Vehicle';

@Injectable()
export class AppService {
  constructor(private manager: EntityManager, private dataSource: DataSource) {}

  findAll() {
    return this.dataSource
      .createQueryBuilder()
      .select('*')
      .from(VehicleModel, 'vehicle')
      .getRawMany();
  }

  create(vehicle: Car | Truck | PickUpTruck) {
    const created = this.manager.create(VehicleModel, {
      cylinderCapacity: Number(vehicle.cylinderCapacity),
      modelYear: Number(vehicle.modelYear),
      valuation: Number(vehicle.valuation),
      currentValue: Number(vehicle.calculateRegistrationCost()),
    });
    this.manager.save(created);
  }
}
