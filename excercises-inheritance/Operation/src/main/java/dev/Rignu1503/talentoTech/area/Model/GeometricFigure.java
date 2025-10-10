package dev.Rignu1503.talentoTech.area.Model;

public class GeometricFigure {
    String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public double calcularArea() {
        return 0;
    }


    @Override
    public String toString() {
        return "GeometricFigure{" +
                "name='" + name + '\'' +
                '}';
    }

}
