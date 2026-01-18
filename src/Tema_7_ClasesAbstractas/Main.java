package Tema_7_ClasesAbstractas;

public class Main {

    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[3];

        figures[0] = new Rectangle(10.5, 3.5, "Azul");
        figures[1] = new Circle(3.5, "Rojo");
        figures[2] = new Triangle(4.0, 8.0, "Verde");

        System.out.println("===Listado de figuras geometricas===");

        for (GeometricFigure f : figures) {
            System.out.println(f.toString());
        
            System.out.printf("Area calculada individualmente: %.2f\n",f.calculateArea());
            System.out.println("-----------------------------");
        }

    }
    
}
