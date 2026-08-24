package Exercicios.Vetores;

import java.util.Scanner;

public class Soma_e_Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma: " + soma);

        double media = (double) soma / numeros.length;

        System.out.println("Media: " + media);

        sc.close();
    }
}
