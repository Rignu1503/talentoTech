package dev.Rignu1503.exercises.example;

import java.util.ArrayList;

public class exercise9 {

     public ArrayList<Integer> ascendingList(int num1, int num2, int num3){

        ArrayList<Integer> ascending = new ArrayList<>();

        if(num1 >= num2 && num1 >= num3){
            ascending.add(num1);
        }
        
        return ascending;
    }

    public static void main(String[] args) {

        exercise9 iv = new exercise9();
        System.out.println(iv.ascendingList(-3, 2, 9));

    }
    
}
