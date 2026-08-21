package Exercicios.EstruturasDeDecisao;

import java.util.Scanner;

public class SistemaDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorCompra;
        double percentualDesconto;


        System.out.print("Qual o valor da compra? ");
        valorCompra = sc.nextInt();

        if (valorCompra >= 500) {
            percentualDesconto = 0.20;
        } else if (valorCompra >= 300) {
            percentualDesconto = 0.10;
        } else if (valorCompra >= 100) {
            percentualDesconto = 0.05;
        } else {
            percentualDesconto = 0;
        }

        double desconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - desconto;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Percentual de desconto: " + (percentualDesconto * 100) + "%");
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}
