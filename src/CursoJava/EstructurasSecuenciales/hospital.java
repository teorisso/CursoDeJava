package CursoJava.EstructurasSecuenciales;

import java.util.Scanner;

public class hospital {
    public static void main(String[] args) {
        //3) En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología.
        // El presupuesto anual del hospital se reparte de la siguiente manera:
        // Área y Presupuesto
        //Urgencias=37%
        //Pediatría=42%
        //Traumatología= 21%
        //Obtener la cantidad de dinero que recibirá cada área para cualquier monto presupuestal.

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto presupuestal del Hospital: ");
        float presupuesto = sc.nextFloat();

        double presupuestoUrgencias = presupuesto*0.37;
        double presupuestoPediatria = presupuesto*0.42;
        double presupuestoTraumatologia = presupuesto*0.21;

        System.out.println("El presupuesto de Urgencias es: " + presupuestoUrgencias);
        System.out.println("El presupuesto de Pediatria es: " + presupuestoPediatria);
        System.out.println("El presupuesto de Traumatologia es: " + presupuestoTraumatologia);

        sc.close();
    }
}
