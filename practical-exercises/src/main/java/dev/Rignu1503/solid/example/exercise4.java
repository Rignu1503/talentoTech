package dev.Rignu1503.solid.example;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise4 {
    
    public ArrayList[] primeNumbera( int[] vector){

        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = 0;vector.length > i; i++){ 
           
            int pairInterador = 0;

            for( int j = 0; i >= j; j++){

                if (j % 2 == 0) {
                    pairInterador++;
                }
            }

            if (pairInterador == 2) {
                prime.add(i);
            }
            pairInterador = 0;
        }

        return new ArrayList[]{prime};
    }

     public static void main(String[] args) {

        exercise4 pn = new exercise4();
        System.out.println(Arrays.toString(pn.primeNumbera(new int[]{1,2,3,4,5,6,7,8})));

    }
}
