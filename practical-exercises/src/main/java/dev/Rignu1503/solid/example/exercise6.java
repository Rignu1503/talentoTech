package dev.Rignu1503.solid.example;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise6 {

        public ArrayList[] negativeVector( int[] vector){

        ArrayList<Integer> negative = new ArrayList<>();

        for(int i = 0; vector.length > i; i++){
          
            if (0 > vector[i]) {
                negative.add(vector[i]);
            }
            
        }

        return new ArrayList[]{negative};
    }

    public static void main(String[] args) {

        exercise6 iv = new exercise6();
        System.out.println(Arrays.toString(iv.negativeVector(new int[]{1,2,-3,4,-5,6,7,8})));

    }
    
}
