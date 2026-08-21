package Exercicios;

import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo ao nosso sistema.");

        sc.close();
    }
}
