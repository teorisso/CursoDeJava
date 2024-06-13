package CursoJava.ParcialGina;
//Dado el siguiente código en Java ¿cuál será la salida del programa?
public class ConfusionParametros {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        intercambiar (a,b);

        System.out.println("a= "+ a+" b= "+ b);
    }
    public static void intercambiar (int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x= "+ x+" y= "+ y);
    }

}
//La respuesta correcta es:
//x = 10, y = 5
//a = 5, b = 10
