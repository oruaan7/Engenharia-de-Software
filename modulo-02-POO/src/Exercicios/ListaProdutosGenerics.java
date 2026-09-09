package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosGenerics {
    public static void main(String[] args) {

        List<Par<String, Double>> produtos = new ArrayList<>();

        produtos.add(new Par<>("Martelo", 25.90));
        produtos.add(new Par<>("Machado", 45.50));
        produtos.add(new Par<>("Enxada", 30.00));
        produtos.add(new Par<>("Picareta", 55.90));
        produtos.add(new Par<>("Alicate", 20.00));

        for (Par<String, Double> produto : produtos) {
            System.out.println(produto.getChave() + " -> " + produto.getValor());
        }

        System.out.println(produtos.size());

        double maisCaro = 0;
        String produtoMaisCaro = "";

        for (Par<String, Double> produto : produtos) {
            if (produto.getValor() > maisCaro) {
                maisCaro = produto.getValor();
                produtoMaisCaro = produto.getChave();
            }
        }
        System.out.println("Produto mais caro: " + produtoMaisCaro + " -> " + maisCaro);

        double soma = 0;

        for (Par<String, Double> produto : produtos) {
            soma += produto.getValor();
        }

        double media = soma / produtos.size();
        System.out.println("Media: " + media);


        for (Par<String, Double> produto : produtos) {
            if (produto.getValor() > 30) {
                System.out.println("Acima de $30: " + produto.getChave() + " -> " + produto.getValor());
            }
        }
    }
}
