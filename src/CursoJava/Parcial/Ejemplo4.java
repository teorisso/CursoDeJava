package CursoJava.Parcial;

public class Ejemplo4 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3};
        duplicarValores(numeros);
        System.out.println(numeros[0]);
    }
    public static void duplicarValores(int[] array){
        for(int i = 0; i< array.length; i++){
            array[i]*=2;
        }
    }
}
//Cual es la salida de este programa
//4 segun el profe
//2 segun el codigo