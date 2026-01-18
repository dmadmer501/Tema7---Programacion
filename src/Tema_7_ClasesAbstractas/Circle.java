package Tema_7_ClasesAbstractas;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
