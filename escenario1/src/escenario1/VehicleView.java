/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escenario1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class VehicleView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehicleController vehicleController = new VehicleController();
        double registrationCarCost;

        ////////////
        Scanner inData = new Scanner(System.in);  // Create a Scanner object

        System.out.println("-------------------------------");
        System.out.println("Menú de opciones");
        System.out.println("-------------------------------");
        System.out.println("a) para Carro");
        System.out.println("b) para Camioneta");
        System.out.println("c) para Camión");
        System.out.println("-------------------------------");
        System.out.println("Seleccione una opción del menú");

        String option = inData.nextLine();
        VehicleType typeVehicle;
        switch (option) {
            case "a":
                typeVehicle = VehicleType.CAR;
                break;
            case "b":
                typeVehicle = VehicleType.PICKUPTRUCK;
                break;
            case "c":
                typeVehicle = VehicleType.TRUCK;
                break;
            default:
                System.out.println("Opción no disponible");

        }
              
        System.out.println("Ingrese el cilindraje");
        int cylinderCapacity = inData.nextInt();

        System.out.println("Ingrese el año del modelo");
        int modelYear = inData.nextInt();

        System.out.println("Ingrese el avaluo comercial");
        double valuation = inData.nextDouble();

        System.out.println("El cilindraje es: " + cylinderCapacity + " año del modelo: " + modelYear + " avaluo comercial: " + valuation);

//        var cilinderCapacity = 1200;
//        var modelYear = 2018;
//        var valuation = 10800;
//        var type = VehicleType.CAR;       
        registrationCarCost = vehicleController.create(VehicleType.CAR, cylinderCapacity, modelYear, valuation).calculateRegistrationCost();

        System.out.println("Valor de matricula: " + registrationCarCost);

    }

}
