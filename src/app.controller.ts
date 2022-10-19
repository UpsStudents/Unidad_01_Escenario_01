import { Body, Controller, Get, Post, Redirect, Render } from '@nestjs/common';
import { AppService } from './app.service';
import { Vehicle } from './Car/Vehicle';
import { VehicleFactoryService } from './Car/VehicleFactoryService';
import { VehicleType } from './Car/VehicleType';
import { Vehicle as VehicleModel } from './Models/Vehicle';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}
  vehicles: VehicleModel[] = [];
  vehicleFactory = new VehicleFactoryService();
  @Get()
  @Render('index')
  async getAssets() {
    this.vehicles = await this.appService.findAll();
    return { vehicles: this.vehicles };
  }

  @Post()
  @Redirect('/')
  async createAsset(@Body() body) {
    let vehicleType;

    switch (body.type) {
      case 'car':
        vehicleType = VehicleType.CAR;
        break;
      case 'truck':
        vehicleType = VehicleType.TRUCK;
        break;
      case 'pickup':
        vehicleType = VehicleType.PICKUPTRUCK;
        break;
    }

    const vehicle = this.vehicleFactory.createVehicle(
      vehicleType,
      body.cylinderCapacity,
      body.modelYear,
      body.valuation,
    );

    await this.appService.create(vehicle as any);
  }
}
