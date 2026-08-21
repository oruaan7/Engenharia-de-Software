package Exercicios.Metodos;

import java.util.Scanner;

public class SistemaDescontoRefatorado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor da compra? ");
        int valorCompra = sc.nextInt();

        double percentualDesconto = calcularPercentualDesconto(valorCompra);
        double desconto = calcularDesconto(valorCompra, percentualDesconto);
        double valorFinal = calcularValorFinal(valorCompra, desconto);

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Percentual de desconto: " + (percentualDesconto * 100) + "%");
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }

    public static double calcularPercentualDesconto(int valorCompra) {
        if (valorCompra >= 500) {
            return  0.20;
        } else if (valorCompra >= 300) {
            return  0.10;
        } else if (valorCompra >= 100) {
            return  0.05;
        } else {
            return  0;
        }
    }

    public static double calcularDesconto(int valorCompra, double percentualDesconto) {
        return valorCompra * percentualDesconto;
    }

    public static double calcularValorFinal(int valorCompra, double desconto) {
        return valorCompra - desconto;
    }
}
