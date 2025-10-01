package dev.Rignu1503.talentoTech;

import dev.Rignu1503.talentoTech.model.Car;
import dev.Rignu1503.talentoTech.model.Motorcycle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informacion clase carro");
        Car myCar = new Car("Toyota", "Corolla", 1986, 2);
        myCar.viewInfo();
        myCar.calculateTax(10);

        System.out.println("\nInformacion clase moto");
        Motorcycle myMotorcycle = new Motorcycle("Suzuky", "best", 2020, 125);
        myMotorcycle.viewInfo();
        myMotorcycle.compareEngine(150);


    }
}