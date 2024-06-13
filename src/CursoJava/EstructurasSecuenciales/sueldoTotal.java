package CursoJava.EstructurasSecuenciales;
import java.util.Scanner;

public class sueldoTotal {
    //4) Escriba un algoritmo que dado el número de horas trabajadas por un empleado y el sueldo por hora,
    // calcule el sueldo total de ese empleado. Tenga en cuenta que las horas extras se pagan el doble.
    // Las horas extras son aquellas que van a partir de las 40 horas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        System.out.print("Ingrese el sueldo por hora: ");
        double sueldo = sc.nextDouble();

        int horasNormales = 40;
        double sueldoTotal;

        if (horasTrabajadas <= horasNormales) {
            sueldoTotal = sueldo * horasTrabajadas;
        }else {
            int horasExtras = horasTrabajadas - horasNormales;
            sueldoTotal = (sueldo * horasNormales) + (sueldo * horasExtras*2);
        }

        System.out.println("El sueldo total: " + sueldoTotal);


    }
}
