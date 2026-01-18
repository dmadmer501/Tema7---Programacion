package Tema_7_Interfaces;

class Profesor extends Persona implements IGestion {
    private static int contadorProfesores = 0;
    private int id;
    private double sueldo;

    public Profesor(String nombre, double sueldo) {
        super(nombre);
        this.id = ++contadorProfesores;
        this.sueldo = sueldo;
    }

    @Override
    public void subirSueldo(double porcentaje) {
        this.sueldo += this.sueldo * (porcentaje / 100);
    }

    @Override
    public void addNota(double nota) {} // Vacío

    @Override
    public String numberType() {
        return "Soy el profesor número: " + id;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Sueldo:%.2f", sueldo);
    }
}
