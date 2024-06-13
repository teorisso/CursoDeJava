package CursoJava.Parcial;

public class Ejemplo {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int suma = sumarDiagonal(matriz);
        System.out.println(suma);
    }

    public static int sumarDiagonal(int[][]matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
}

//cual es la salida de este programa?
//15
