package CursoJava.Parcial;

public class RotarMatriz {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        matriz = rotarMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }
    public static int[][] rotarMatriz(int[][] matriz) {
        int n = matriz.length;
        int [][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[j][n -1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;

    }
}
