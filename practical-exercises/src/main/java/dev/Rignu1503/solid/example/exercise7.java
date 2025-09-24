package dev.Rignu1503.solid.example;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise7 {
    
    public ArrayList[] multiplesTwo(){

        ArrayList<Integer> multiples = new ArrayList<>();

        int number = 0;

        for (int i = 0; number <= 4570; i++) {
            
            number = i * 2;
            multiples.add(number);
        }
        
        return new ArrayList[]{multiples};
    }

    public static void main(String[] args) {
        exercise7 mt = new exercise7();
        System.out.println(Arrays.toString(mt.multiplesTwo()));
    }
}
