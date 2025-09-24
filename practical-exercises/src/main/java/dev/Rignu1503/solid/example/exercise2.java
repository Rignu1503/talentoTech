package dev.Rignu1503.solid.example;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise2 {


    public ArrayList[] invertVector( int[] vector){

        ArrayList<Integer> invert = new ArrayList<>();

        for(int i = vector.length; i >= 0; i--){
            invert.add(i);
            
        }

        return new ArrayList[]{invert};
    }

    public static void main(String[] args) {

        exercise2 iv = new exercise2();
        System.out.println(Arrays.toString(iv.invertVector(new int[]{1,2,3,4,5,6,7,8})));

    }

}
