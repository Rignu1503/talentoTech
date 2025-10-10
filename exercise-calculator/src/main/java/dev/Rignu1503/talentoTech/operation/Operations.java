package dev.Rignu1503.talentoTech.operation;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Operations {

    public static void sum(){

        String option = "";
        int result = 0;
        try {

            while(true){

                option = JOptionPane.showInputDialog("""
                    
                    -- Suma --
                    INGRESE UN CARACTER PARA SALIR:
                    
                    """);
                int num1 = parseInt(option);
                result += num1;
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (result));
        }

    }

    public static void subtract(){

        int result = 0;
        try {
            while (true){

                String option = JOptionPane.showInputDialog("""
                    
                    -- resta --
                    INGRESE UN CARACTER PARA SALIR:
                    
                    """);
                int num1 = parseInt(option);
                result -= num1;
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (result));
        }
    }

    public static void multiplication(){

        int result = 0;
        try {
            while (true){

                String option = JOptionPane.showInputDialog("""
                    
                    -- resta --
                    INGRESE UN CARACTER PARA SALIR:
                    
                    """);
                int num1 = parseInt(option);
                result *= num1;
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + (result));
        }
    }

    public static void division(){

        int num1 = parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int num2 = parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        if (num2 == 0 || num1 == 0){
            JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
            return;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (num1 / num2));
    }

}
