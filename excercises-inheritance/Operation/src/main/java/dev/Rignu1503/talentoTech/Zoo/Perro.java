package dev.Rignu1503.talentoTech;

import dev.Rignu1503.talentoTech.Model.Animal;

public class Perro extends Animal {

    public Perro(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println("El perro hace guau");
    }
}
