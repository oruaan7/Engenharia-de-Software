package Exercicios.Matrizes;

import java.util.Scanner;

public class Matriz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite o valor " + "[" + (i) + "]" + "[" + (j) + "]" + ":");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
