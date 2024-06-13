package CursoJava.Parcial;

public class Ejemplo2 {
    public static void main(String[] args) {
        int [] valores = {1,2,3,4,5};
        int resultado = calcularSuma(valores);
        System.out.println(resultado);
    }
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
}
//Cual es la salida del programa?
//15

