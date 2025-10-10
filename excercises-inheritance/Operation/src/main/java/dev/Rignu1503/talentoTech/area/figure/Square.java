package dev.Rignu1503.talentoTech.area.figure;

import dev.Rignu1503.talentoTech.area.interfaces.getArea;

public class Square implements getArea {

    double side;

    @Override
    public double area() {
         return side * side;
    }
}
