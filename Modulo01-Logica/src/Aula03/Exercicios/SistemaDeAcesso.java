package Aula03.Exercicios;

import java.util.Scanner;

public class SistemaDeAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        boolean ingresso;
        boolean bloqueado = false;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Possui ingresso? (true/false)");
        ingresso = sc.nextBoolean();

        System.out.println("Esta bloqueado? (true/false)");
        bloqueado = sc.nextBoolean();

        if (idade >= 18 && ingresso && !bloqueado) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado!");
        }


        sc.close();
    }
}
