package Aula03.Exercicios;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        boolean estudante;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("E estudante? (true/false)");
        estudante = sc.nextBoolean();

        if (estudante || idade >= 60) {
            System.out.println("Voce tem desconto!");
        } else {
            System.out.println("Voce nao tem desconto!");
        }

        sc.close();
    }
}
