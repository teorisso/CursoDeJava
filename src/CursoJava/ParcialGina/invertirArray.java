package CursoJava.ParcialGina;

public class invertirArray{
    public static int [] invertir (int[]array){
        int [] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
            //revisar la linea anterior que no tenga  /2
        }
        return arrayInvertido;
    }
}
