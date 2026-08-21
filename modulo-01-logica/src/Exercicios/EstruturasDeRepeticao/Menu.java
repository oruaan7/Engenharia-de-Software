package Exercicios.EstruturasDeRepeticao;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Mostrar número de 1 a 10");
            System.out.println("3 - Mostrar números pares de 1 a 20");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma das opcoes acima: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá");
                    break;
                case 2:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 20; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }

        } while (opcao != 0);



        sc.close();
    }
}
