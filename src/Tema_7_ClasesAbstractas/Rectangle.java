package Tema_7_ClasesAbstractas;

public class Rectangle extends GeometricFigure {
    private double base;
    private double height;

    public Rectangle(double base, double height, String colour) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

}
