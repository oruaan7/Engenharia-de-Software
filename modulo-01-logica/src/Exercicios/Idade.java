package Exercicios;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        System.out.println("Voce tem " + idade + " anos.");

        sc.close();
    }
}
