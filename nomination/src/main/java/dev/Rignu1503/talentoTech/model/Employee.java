package dev.Rignu1503.talentoTech.model;

import javax.swing.*;

public class Employee {

    String name;
    String lastName;
    String jopTitle;
    int baseSalary;
    int daysWorked;
    int naturalSalary;

    public void initializeEmployee(){

        name = JOptionPane.showInputDialog("Ingrese su nombre: ");
        lastName = JOptionPane.showInputDialog("ngrese su apellido: ");
        jopTitle = JOptionPane.showInputDialog("ngrese su cargo: ");
        baseSalary = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario base: "));
        daysWorked = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias trabajados: "));
        naturalSalary = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario natural: "));
    }

    public void calculateSalud(){

        int salud = (naturalSalary * 4) / 100;
        JOptionPane.showMessageDialog(null, "El valor a descontar por salud es: " + salud);

    }

    public void nomination(){


        JOptionPane.showMessageDialog(null, """
                nombre : """ + name + """
                apellido : """ + lastName + """
                cargo : """ + jopTitle + """
                salario base : """ + baseSalary + """
                dias trabajados : """ + daysWorked + """
                salario natural : """ + naturalSalary );

    }
}
