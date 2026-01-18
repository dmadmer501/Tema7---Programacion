package Tema_7_Interfaces;

class Alumno extends Persona implements IGestion {
    private static int contadorAlumnos = 0;
    private int id;
    private double[] notas = new double[3];
    private int contadorNotas = 0;

    public Alumno(String nombre) {
        super(nombre);
        this.id = ++contadorAlumnos;
    }

    @Override
    public void addNota(double nota) {
        if (contadorNotas < 3) {
            notas[contadorNotas] = nota;
            contadorNotas++;
        }
    }

    @Override
    public void subirSueldo(double porcentaje) {} // Vacío

    @Override
    public String numberType() {
        return "Soy el alumno número: " + id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        if (contadorNotas > 0) {
            sb.append("\n    Notas:");
            for (int i = 0; i < contadorNotas; i++) {
                sb.append(String.format("\n    Nota %d:%.2f", (i + 1), notas[i]));
            }
        }
        return sb.toString();
    }
}