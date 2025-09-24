package dev.Rignu1503.solid.example;

import java.util.ArrayList;

public class exercise4 {
    
    public ArrayList<Integer> primeNumbera( int[] vector){

        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = 0;vector.length > i; i++){
            int num = vector[i];
            int divisorCount = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    divisorCount++;
                }
                
            }

            if (divisorCount == 2) {
                prime.add(num);
            } 
        }

        return prime;
    }

     public static void main(String[] args) {

        exercise4 pn = new exercise4();
        System.out.println(pn.primeNumbera(new int[]{1,2,3,4,5,6,7,8})); //Salida: [2, 3, 5, 7]

    }
}
