package dev.Rignu1503.exercises.example;

public class exercise10 {
    
    public int getAreaCircle(int radius){
        return (int) (Math.PI * (radius * radius));
    }

    public int getAreaSquare(int side){
        return side * side;
    }

    public int getAreaRectangle(int side1, int side2){
        return side1 * side2;
    }

    public int getAreaTriangle(int base, int height){
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        
        exercise10 area = new exercise10();
        System.out.println(area.getAreaCircle(5));              //Salida: 78
        System.out.println(area.getAreaSquare(6));                //Salida: 36
        System.out.println(area.getAreaRectangle(8, 4));   //Salida: 32
        System.out.println(area.getAreaTriangle(10, 5));   //Salida: 25
        
    }
    
}
