package Tema_7_ClasesAbstractas;

public abstract class GeometricFigure {
    protected String colour;

    public GeometricFigure(String colour) {
        this.colour = colour;
    }

    public abstract double calculateArea();

    public String getColour() {
        return colour;
    }

    public String toString() {
        return String.format("Tipo: %s | Color: %s | Área: %.2f", getClass().getSimpleName(), colour, calculateArea());
    }



}
