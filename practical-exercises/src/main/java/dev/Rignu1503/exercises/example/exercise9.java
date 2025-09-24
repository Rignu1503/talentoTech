package dev.Rignu1503.exercises.example;
import java.util.ArrayList;

public class exercise9 {

    public ArrayList<Integer> ascendingList(int num1, int num2, int num3) {
        ArrayList<Integer> ascending = new ArrayList<>();

        int menor, medio, mayor;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        // Agregar en orden ascendente
        ascending.add(menor);
        ascending.add(medio);
        ascending.add(mayor);

        return ascending;
    }

    public static void main(String[] args) {
        exercise9 iv = new exercise9();

        System.out.println(iv.ascendingList(9, 50, 4)); //Salida [4, 9, 50]
        System.out.println(iv.ascendingList(-3, 2, 9));   //Salida [-3, 2, 9]
        System.out.println(iv.ascendingList(7, 7, 1)); //Salida [1, 7, 7]
    }
}
