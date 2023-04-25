//con errores
package javaapplication3;

public class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];

        // Creamos a los 8 estudiantes con sus respectivas notas
        estudiantes[0] = new Estudiante("Ana", 8.5);
        estudiantes[1] = new Estudiante("Beto", 7.2);
        estudiantes[2] = new Estudiante("Carlos", 6.9);
        estudiantes[3] = new Estudiante("Diana", 9.0);
        estudiantes[4] = new Estudiante("Elena", 8.1);
        estudiantes[5] = new Estudiante("Fernando", 7.5);
        estudiantes[6] = new Estudiante("Gabriela", 9.2);
        estudiantes[7] = new Estudiante("Hector", 8.8);

        // Calculamos el promedio de notas de todo el curso
        double promedio = 0.0;
        for (Estudiante estudiante : estudiantes) {
            promedio += estudiante.nota;
        }
        promedio /= estudiantes.length;
        System.out.println("El promedio de notas de todo el curso es: " + promedio);

        // Creamos un arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso
        String[] nombresMayoresPromedio = new String[estudiantes.length];
        int j = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.nota > promedio) {
                nombresMayoresPromedio[j] = estudiante.nombre;
                j++;
            }
        }

        // Mostramos los nombres de los alumnos que recibieron una nota mayor al promedio del curso
        System.out.println("Los estudiantes que recibieron una nota mayor al promedio son:");
        for (int i = 0; i < j; i++) {
            System.out.println(nombresMayoresPromedio[i]);
        }

        // Mostramos todos los estudiantes con una nota mayor al promedio
        System.out.println("Todos los estudiantes con una nota mayor al promedio son:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.nota > promedio) {
                System.out.println(estudiante.nombre + ": " + estudiante.nota);
            }
        }
    }
}

