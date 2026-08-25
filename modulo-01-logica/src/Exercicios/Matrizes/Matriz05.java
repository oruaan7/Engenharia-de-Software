package Exercicios.Matrizes;

import java.util.Scanner;

public class Matriz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        System.out.print("Qual o tamanho da matriz? ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor " + "[" + (i) + "]" + "[" + (j) + "]" + ":");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        for (int i = 0; i < n; i++) {
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }


        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da diagonal secundaria: " + somaDiagonalSecundaria);

        sc.close();
    }
}
