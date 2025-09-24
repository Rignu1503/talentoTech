package dev.Rignu1503.solid.example;

import java.util.*;

public class exercise1 {

    public ArrayList[] matrixPair ( int[] vector) {

        ArrayList<Integer> pair = new ArrayList<>();

        for(int i: vector){
            if ( i % 2 == 0){
                pair.add(i);
            }
        }

        return new ArrayList[]{pair};
    }

    public static void main(String[] args) {

        exercise1 mp = new exercise1();
        System.out.println(Arrays.toString(mp.matrixPair(new int[]{1,2,3,4,5,6,7,8})));
    }
}
