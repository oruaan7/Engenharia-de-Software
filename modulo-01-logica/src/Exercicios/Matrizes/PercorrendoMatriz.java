package Exercicios.Matrizes;

import java.util.Scanner;

public class PercorrendoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.println(matriz[i][i] + " ");
        }

        sc.close();
    }
}
