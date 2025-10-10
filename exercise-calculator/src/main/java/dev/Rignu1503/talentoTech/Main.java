package dev.Rignu1503.talentoTech;

import dev.Rignu1503.talentoTech.operation.Operations;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String option = "";

        do{
            option = JOptionPane.showInputDialog("""
                    
                    -- Menu --
                    INGRESE UN NUMERO PARA SELECCIONAR UNA OPCION:
                    
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    0. Salir
                    
                    """);


            switch (option){
                case "1":
                    Operations.sum();
                    break;
                case "2":
                    Operations.subtract();
                    break;
                case "3":
                    Operations.multiplication();
                    break;
                case "4":
                    Operations.division();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora");
                    break;
            }
        }while (!option.equals("0"));
    }
}