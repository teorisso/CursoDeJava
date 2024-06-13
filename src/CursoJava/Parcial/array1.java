package CursoJava.Parcial;

public class array1 {
    public static void main(String[] args) {
       int [] array1 = {1,2,3,4,6,7,8,9,10};
       array1=  invertir(array1);

       for (int i = 0; i < array1.length; i++) {
           System.out.print(array1[i] + ",");
       }
    }

    public static int [] invertir (int[]array){
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
            // Asigna a la posición 'i' del nuevo array el valor de la posición 'array.length - 1 - i'
            // del array original, invirtiendo así los elementos.
            //el array.length es uno mas que la posicion del ultimo subindice
        }

        return arrayInvertido;
    }
}
