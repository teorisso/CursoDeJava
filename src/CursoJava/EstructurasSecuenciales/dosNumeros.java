package CursoJava.EstructurasSecuenciales;

import java.util.Scanner;

public class dosNumeros {
    //5) Leer dos números y encontrar:
    //a. La suma del doble del primero más el cuadrado del segundo.
    //b. El promedio de sus cubos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = sc.nextDouble();

        double resultadoa = (n1*2)+(n2*n2);
        System.out.println("La suma del doble del primero más el cuadrado del segundo es: "+resultadoa);

        double resultadob = ((n1*n1*n1)+(n2*n2*n2))/2;
        System.out.println("El promedio de sus cubos es: "+resultadob);



    }
}
