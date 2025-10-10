package dev.Rignu1503.talentoTech.Zoo.Model;

import javax.swing.*;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("El animal hace un sonido");
    }

    public void addAnimal() {
        this.name = JOptionPane.showInputDialog("Ingresa el nombre del animal");
        this.age = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero del animal"));
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
