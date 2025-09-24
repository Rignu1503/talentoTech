package dev.Rignu1503.exercises.example;

import java.util.*;

public class exercise1 {

    public ArrayList<Integer> matrixPair ( int[] vector) {

        ArrayList<Integer> pair = new ArrayList<>();

        for(int i: vector){
            if ( i % 2 == 0){
                pair.add(i);
            }
        }
        return pair;
    }

    public static void main(String[] args) {

        exercise1 mp = new exercise1();
        System.out.println(mp.matrixPair(new int[]{1,2,3,4,5,6,7,8, 12})); //Salida: [[2, 4, 6, 8, 12]]
    }
}
