package CursoJava.EstructurasSecuenciales;

public class preguntaParcial {
    public static void main(String[] args) {
        int [] numeros = {1,2,3};
        cambiarPrimerElemento(numeros);
        System.out.println(numeros[0]);

    }
    public static void cambiarPrimerElemento (int [] array){
        array[0] = 10;

    }
}
