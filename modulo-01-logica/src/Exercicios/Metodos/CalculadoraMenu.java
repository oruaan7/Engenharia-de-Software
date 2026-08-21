package Exercicios.Metodos;

import java.util.Scanner;

public class CalculadoraMenu {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("===== CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao != 0) {
                System.out.print("Digite o primeiro número: ");
                double num1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = sc.nextDouble();

                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = somar(num1, num2);
                        System.out.println(resultado);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        System.out.println(resultado);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        System.out.println(resultado);
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        System.out.println(resultado);
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                }
            }

        } while (opcao != 0);

        System.out.println("Saindo...");
        sc.close();
    }
}
