package Exercicios.EstruturasDeDecisao;

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade!");
        }
        else {
            System.out.println("Menor de idade!");
        }


        sc.close();
    }
}
