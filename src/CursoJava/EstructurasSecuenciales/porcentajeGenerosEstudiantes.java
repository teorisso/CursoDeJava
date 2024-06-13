package CursoJava.EstructurasSecuenciales;

import java.util.Scanner;

public class porcentajeGenerosEstudiantes {
    //7) Un profesor desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo de estudiantes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingese el número de hombres: ");
        int hombres = sc.nextInt();

        System.out.print("Ingrese el número de mujeres: ");
        int mujeres = sc.nextInt();

        int totalAlumnos = hombres + mujeres;

        double porcentajeHombres = ((double) hombres / totalAlumnos)*100;
        double porcentajeMujeres = ((double) mujeres / totalAlumnos)*100;

        System.out.println("El porcentaje de hombres: " + porcentajeHombres + "%" );
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");

    }
}
