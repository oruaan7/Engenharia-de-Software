package Exercicios.Matrizes;

import java.util.Scanner;

public class ProjetoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual sera o tamanho da matriz?");
        int tamanhoMatriz = sc.nextInt();

        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite o valor " + "[" + i + "]" + "[" + j + "]" + ":");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("===== MATRIZ =====");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int maior = encontrarMaior(matriz);
        int menor = encontrarMenor(matriz);
        int soma = calcularSoma(matriz);
        int somaDiagonalPrincipal = calcularDiagonalPrincipal(matriz);
        int somaDiagonalSecundaria = calcularDiagonalSecundaria(matriz);

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.println("Soma Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma Diagonal Secundaria: " + somaDiagonalSecundaria);

        sc.close();
    }

    public static int encontrarMaior(int[][] matriz) {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }

    public static int encontrarMenor(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int calcularSoma(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static int calcularDiagonalPrincipal(int[][] matriz) {
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        return somaDiagonalPrincipal;
    }

    public static int calcularDiagonalSecundaria(int[][] matriz) {
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }
        return somaDiagonalSecundaria;
    }
}
