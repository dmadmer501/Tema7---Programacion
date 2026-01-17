package Tema_7_ConstructoresYvisibilidad;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ConsoleInput {

    private Scanner keyboard;

    public ConsoleInput(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    private void cleanInput() {
        if (keyboard.hasNextLine()) {
            keyboard.nextLine();
        }
    }

    public int readInt() {
        while (true) {
            try {
                int value = keyboard.nextInt();
                cleanInput(); // Limpiamos el \n que deja el número para que el siguiente String no falle
                return value;
            } catch (InputMismatchException e) {
                System.err.println("Error: Introduce un número entero válido");
                cleanInput();
            }
        }
    }

    public double readDouble() {
        while (true) {
            try {
                double value = keyboard.nextDouble();
                cleanInput(); // Limpiamos el \n
                return value;
            } catch (InputMismatchException e) {
                System.err.println("Error: Introduce un número decimal válido");
                cleanInput();
            }
        }
    }

    public String readString() {
        // No necesita try-catch ni cleanInput interno si readInt ya limpia
        return keyboard.nextLine();
    }

    public char readChar() {
        while (true) {
            String s = keyboard.nextLine();
            if (s.length() == 1) {
                return s.charAt(0);
            }
            System.err.println("Error: Introduce solo un carácter");
        }
    }

    // Corregido a boolean como pedía el ejercicio
    public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
        char aff = Character.toUpperCase(affirmativeValue);
        char neg = Character.toUpperCase(negativeValue);

        while (true) {
            char userChar = Character.toUpperCase(readChar());
            if (userChar == aff) return true;
            if (userChar == neg) return false;
            
            System.err.printf("Error: Introduce '%c' o '%c': ", aff, neg);
        }
    }
}