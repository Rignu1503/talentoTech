package dev.Rignu1503.talentoTech.model;

public class Car extends Vehicules {

    int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void viewInfo() {
        super.viewInfo();
        System.out.println("Doors: " + doors);
    }

    public void calculateTax(int percentage) {
        int tax = (year * percentage) / 100;
        System.out.println("Impuesto: " + tax);

    }



}
