package Exercicios.EstruturasDeRepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println(n + "! = " + fatorial);

        sc.close();
    }
}