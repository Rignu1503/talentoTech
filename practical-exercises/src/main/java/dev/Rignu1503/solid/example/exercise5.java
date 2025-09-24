package dev.Rignu1503.solid.example;

public class exercise5 {
    
    public String positionVector( int[] vector, int num){
    
        for (int i = 0; i < vector.length; i++) {

            if (num == vector[i]) {
                return "La posicion del numero es " + (i + 1);
            }

        }
    
    return "el numero no exite";
    }

    public static void main(String[] args) {
        
        exercise5 pv = new exercise5();
        System.out.println(pv.positionVector(new int[]{1,2,3,42,5,6,7,8}, 42)); //salida: La posicion del numero es 4
        System.out.println(pv.positionVector(new int[]{1,2,3,42,5,6,7,8}, 76)); //salida: el numero no exite
    }
}



