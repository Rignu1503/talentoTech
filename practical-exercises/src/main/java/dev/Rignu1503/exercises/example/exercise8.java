package dev.Rignu1503.exercises.example;

import java.util.ArrayList;

public class exercise8 {

    public ArrayList<Integer> fibonacci(){

        ArrayList<Integer> fibonacci = new ArrayList<>();
        int num1 = 0;
        int num2 = 1;

        fibonacci.add(num1, num2);

        for (int i = 0; i < 10; i++) {;

            int num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        
            fibonacci.add(num3);
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        
        exercise8 e8 = new exercise8();
        System.out.println(e8.fibonacci());
    }
    

}
