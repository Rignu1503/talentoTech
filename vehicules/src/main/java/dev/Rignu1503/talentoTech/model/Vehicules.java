package dev.Rignu1503.talentoTech.model;

public class Vehicules {
    String brand;
    String model;
    int year;

    public Vehicules(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    public void viewInfo() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Año: " + year);
    }
}
