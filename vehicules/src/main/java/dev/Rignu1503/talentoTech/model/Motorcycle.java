package dev.Rignu1503.talentoTech.model;

public class Motorcycle extends Vehicules {
    int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void viewInfo() {
        super.viewInfo();
        System.out.println("Capacidad de la otra moto: " + engineCapacity + "cc");
    }

    public void compareEngine(int otherCapacity){
        if(this.engineCapacity == otherCapacity){
            System.out.println("Las motos tienen la misma cilindrada");
        }
        else if(this.engineCapacity > otherCapacity){
            System.out.println("La moto actual tiene mayor cilindrada");
        }
        else{
            System.out.println("La otra moto tiene mayor cilindrada");
        }
    }


}
