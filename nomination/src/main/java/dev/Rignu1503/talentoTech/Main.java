package dev.Rignu1503.talentoTech;

import dev.Rignu1503.talentoTech.model.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.initializeEmployee();
        employee.calculateSalud();
        employee.nomination();

    }
}