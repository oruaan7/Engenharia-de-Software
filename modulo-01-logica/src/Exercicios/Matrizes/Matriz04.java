package Exercicios.Matrizes;

public class Matriz04 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
