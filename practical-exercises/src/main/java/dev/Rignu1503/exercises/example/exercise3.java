package dev.Rignu1503.exercises.example;

public class exercise3 {

    public String positiveVector(int[] vector){

        for (int i : vector) {
            
            if (i > 0) {
                
            } else {
                return "No todos los elementos son positivos";
            }
        }
        return "Todos los elementos son positivos";
    }

    public static void main(String[] args) {

        exercise3 ps = new exercise3();
        System.out.println(ps.positiveVector(new int[]{1,2,3,4,5,-6,7,8})); //Salida No todos los elementos son positivos
        System.out.println(ps.positiveVector(new int[]{1,2,3,4,5,6,7,8})); //Salida Todos los elementos son positivos

    }
    
}
