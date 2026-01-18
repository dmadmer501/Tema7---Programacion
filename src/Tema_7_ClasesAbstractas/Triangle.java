package Tema_7_ClasesAbstractas;

public class Triangle extends GeometricFigure {
    private double base;
    private double height;

    public Triangle(double base, double height, String colour) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

}
