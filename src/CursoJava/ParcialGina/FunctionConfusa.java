package CursoJava.ParcialGina;
//Analiza el código y determina cuál será la salida cuando se ejecuta el programa. Selecciona la respuesta correcta
//entre las opciones proporcionadas
//a. 10
//b. 7
//c. 8 CORRECTA
public class FunctionConfusa {
    public static void main(String[] args) {
        System.out.println(funcionA(5));
    }

    public static int funcionA(int x) {
        if (x <= 1) {
            return x;
        }else {
            return funcionB(x - 1) + funcionA(x - 2);

        }
    }

    public static int funcionB(int y) {
        if (y <= 2) {
            return y;
        } else {
            return funcionA(y - 1) + funcionB(y - 2);
        }
    }
}
