package Exercicios.EstruturasDeRepeticao;

import java.util.Scanner;

public class Soma1AteN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int soma = 0;

        System.out.println("Digite um numero: ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            soma = soma + i;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
