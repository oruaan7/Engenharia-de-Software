package Exercicios;

import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int soma;

        System.out.print("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = sc.nextInt();

        soma = n1 + n2;
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
