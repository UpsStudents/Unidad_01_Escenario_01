import { Column, Entity, PrimaryGeneratedColumn } from 'typeorm';

@Entity()
export class Vehicle {
  @PrimaryGeneratedColumn()
  id?: number;
  @Column({ type: 'float' })
  cylinderCapacity: number;
  @Column({ type: 'float' })
  modelYear: number;
  @Column({ type: 'float' })
  valuation: number;
  @Column({ type: 'float' })
  currentValue: number;
}
