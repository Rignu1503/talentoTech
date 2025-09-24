package dev.Rignu1503.solid.example;

import java.util.ArrayList;
public class exercise6 {

        public ArrayList<Integer> negativeVector( int[] vector){

        ArrayList<Integer> negative = new ArrayList<>();

        for(int i = 0; vector.length > i; i++){
          
            if (0 > vector[i]) {
                negative.add(vector[i]);
            }
            
        }

        return negative;
    }

    public static void main(String[] args) {

        exercise6 iv = new exercise6();
        System.out.println(iv.negativeVector(new int[]{1,2,-3,4,-5,6,7,8})); //salida [[-3, -5]]

    }
    
}
