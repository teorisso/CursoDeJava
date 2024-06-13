package CursoJava.EstructurasSecuenciales;
import java.util.Scanner;

public class boletoViaje {

    public static void main(String[] args) {
        //1) Calcula el precio de un boleto de viaje,
        // tomando en cuenta el número de kilómetros que se van a recorrer,
        // siendo el precio $45 por Km.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de kilómetros que se van a recorrer: ");
        int n = sc.nextInt();

        final var precioKm = 45;
        System.out.println("El precio del boleto de viaje es: " + precioKm*n);

        sc.close();

    }
}
