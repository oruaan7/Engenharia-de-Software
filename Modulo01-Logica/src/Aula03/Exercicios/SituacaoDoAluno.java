package Aula03.Exercicios;

import java.util.Scanner;

public class SituacaoDoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.println("Digite a sua nota: ");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperacao!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}
