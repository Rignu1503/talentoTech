package dev.Rignu1503.talentoTech;

import dev.Rignu1503.talentoTech.Zoo.Gato;
import dev.Rignu1503.talentoTech.Zoo.Perro;

public class Main {
    public static void main(String[] args) {

        Gato gato = new Gato("Michi", 3);
        Perro perro = new Perro("Firulais", 5);
        gato.makeSound();
        perro.makeSound();

        gato.addAnimal();
        System.out.println(gato.toString());
        perro.addAnimal();
        System.out.println(perro.toString());

    }
}