package dev.Rignu1503.exercises.example;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise2 {
 
    public ArrayList<Integer> invertVector( int[] vector){

        ArrayList<Integer> invert = new ArrayList<>();

        for(int i = vector.length - 1; i >= 0; i--){
            
            invert.add(vector[i]);
            
        }

        return invert;
    }

    public static void main(String[] args) {

        exercise2 iv = new exercise2();
        System.out.println(iv.invertVector(new int[]{1,2,3,4,5,56,7,8})); //salida: [[8, 7, 56, 5, 4, 3, 2, 1]]

    }
}
