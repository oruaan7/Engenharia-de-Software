package Aula03.Exercicios;

import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, opcao;

        System.out.println("Primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        n2 = sc.nextInt();

        System.out.println();
        System.out.println("=== Menu de operacoes ===");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Resultado Soma: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado Subtracao: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado Multiplicacao: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("O valor ZERO nao pode ser utilizado na operacao de divisao!");
                } else {
                    System.out.println("Resultado Divisao: " + ((double) n1 / n2));
                }
                break;
            default:
                System.out.println("Opcao invalida!");
        }

        sc.close();
    }
}
