package Exercicios.EstruturasDeDecisao;

import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3;


        System.out.println("Digite suas 3 notas em sequencia: ");
        nota1 = sc.nextInt();
        nota2 = sc.nextInt();
        nota3 = sc.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Media: " + media);
            System.out.println("Aprovado!");
        } else if (media >=5 && media < 7) {
            System.out.println("Media: " + media);
            System.out.println("Recuperacao");
        }
        else {
            System.out.println("Media: " + media);
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
