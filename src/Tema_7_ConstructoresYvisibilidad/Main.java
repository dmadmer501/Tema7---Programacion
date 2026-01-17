package Tema_7_ConstructoresYvisibilidad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsoleInput ci = new ConsoleInput(new Scanner(System.in));

        // 1. Crear y mostrar Profesor con datos del teclado
        System.out.println("--- INTRODUCE DATOS DEL PROFESOR ---");
        Profesor prof = new Profesor();
        rellenarPersona(prof, ci);
        System.out.print("Sueldo: ");
        prof.setSueldo(ci.readDouble());
        System.out.println("\nProfesor guardado: " + prof.toString());

        // 2. Crear y mostrar Alumno con datos del teclado
        System.out.println("\n--- INTRODUCE DATOS DEL ALUMNO ---");
        Alumno alu = new Alumno();
        rellenarPersona(alu, ci);
        System.out.print("¿Es repetidor? (S/N): ");
        alu.setRepetidor(ci.readBooleanUsingChar('S', 'N'));
        System.out.println("\nAlumno guardado: " + alu.toString());

        // 3. VARIABLE DEL PADRE (Polimorfismo)
        System.out.println("\n--- USO DE VARIABLE PADRE ---");
        Persona alguien; // Declaramos la variable del padre

        System.out.print("¿Qué quieres crear? (1-Profesor / 2-Alumno): ");
        int opcion = ci.readInt();

        if (opcion == 1) {
            alguien = new Profesor();
            System.out.println("Has creado un Profesor por defecto.");
        } else {
            alguien = new Alumno();
            System.out.println("Has creado un Alumno por defecto.");
        }

        // Aquí ocurre la magia: se usa el toString del objeto que haya dentro
        System.out.println("Contenido de la variable: " + alguien.toString());
    }

    // Método para no repetir las preguntas de Persona dos veces
    public static void rellenarPersona(Persona p, ConsoleInput ci) {
        System.out.print("Nombre: ");
        p.setNombre(ci.readString());
        System.out.print("Edad: ");
        p.setEdad(ci.readInt());
        System.out.print("Nacionalidad: ");
        p.setNacionalidad(ci.readString());
        System.out.print("Sexo (M/F): ");
        // Usamos tu método booleano para el sexo
        boolean esMasculino = ci.readBooleanUsingChar('M', 'F');
        p.setSexo(esMasculino ? 'M' : 'F');
    }
}