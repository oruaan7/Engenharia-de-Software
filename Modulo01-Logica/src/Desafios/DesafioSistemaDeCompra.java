// Problema: Criar um sistema informativo de compra
// Entradas: nome, preco, qtdComprada
// Processamento: total = preco * qtdComprada
// Saida: Produto, Preco, Quantidade, Total.

package Desafios;

import java.util.Scanner;

public class DesafioSistemaDeCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double preco;
        int qtdComprada;

        // Leituras
        System.out.println("Qual produto deseja comprar? ");
        nome = sc.nextLine();

        preco = 150.00;

        System.out.println("Qual a quantidade desejada?");
        qtdComprada = sc.nextInt();

        double total = preco * qtdComprada;
        double percentualDesconto = 10.0;
        double valorDescontoPercentual = total * (percentualDesconto / 100);
        double precoComDescontoPercentual = total - valorDescontoPercentual;

        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$" + preco);
        System.out.println("Quantidade: " + qtdComprada);
        System.out.println("Total sem desconto: R$" + total);
        System.out.println("Desconto: R$" + valorDescontoPercentual);
        System.out.println("Total com desconto: R$" + precoComDescontoPercentual);


    }
}
