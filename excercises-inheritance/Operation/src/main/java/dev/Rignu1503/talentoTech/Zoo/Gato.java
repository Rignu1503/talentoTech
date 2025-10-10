package dev.Rignu1503.talentoTech.Zoo;

import dev.Rignu1503.talentoTech.Zoo.Model.Animal;

public class Gato  extends Animal {
    public Gato(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("El gato hace miau");
    }

    @Override
    public void addAnimal() {
        super.addAnimal();
    }
}
