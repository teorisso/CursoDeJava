package CursoJava.Parcial;

public class Ejemplo3 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3};
        cambiarPrimerElemento(numeros);
        System.out.println(numeros[0]);
    }
    public static void cambiarPrimerElemento(int [] array) {
        array[0] = 10;
    }
}
// cual es la salida de este programa
//10