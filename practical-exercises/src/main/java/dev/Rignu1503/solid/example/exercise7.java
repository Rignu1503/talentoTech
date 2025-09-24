package dev.Rignu1503.solid.example;

import java.util.ArrayList;

public class exercise7 {
    
    public ArrayList<Integer> multiplesTwo(){

        ArrayList<Integer> multiples = new ArrayList<>();

        int number = 0;

        for (int i = 0; number <= 4570; i++) {
            
            number = i * 2;
            multiples.add(number);
        }
        //Retorno mejor una lista con todos los multiplos para no saturar la consola
        return multiples;
    }

    public static void main(String[] args) {
        exercise7 mt = new exercise7();
        System.out.println(mt.multiplesTwo());  //
    }
}
