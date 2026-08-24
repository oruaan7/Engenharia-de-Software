package Exercicios.Vetores;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println("Numeros digitados: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}
