package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutos {
    public static void main(String[] args) {
        List<String> produtos = new ArrayList<>();

        produtos.add("Machado");
        produtos.add("Picareta");
        produtos.add("Enxada");
        produtos.add("Martelo");
        produtos.add("Chave");

        System.out.println("=== Mostrando os produtos ===");
        for (String produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("=== Quantidade de produtos ===");
        System.out.println(produtos.size());

        System.out.println("=== Primeiro produto da lista ===");
        System.out.println(produtos.getFirst());

        System.out.println("=== Alterando o 3o produto ===");
        produtos.set(3, "Alicate");
        System.out.println("O 3o produto agora e: " + produtos.get(3));

        System.out.println("=== Verificando com contains() ===");
        if (produtos.contains("Notebook")) {
            System.out.println("Notebook esta na lista.");
        } else {
            System.out.println("Notebook nao esta na lista.");
        }

        System.out.println("=== Descobrindo a posicao de Picareta ===");
        System.out.println("Picareta esta na posicao " + produtos.indexOf("Picareta") + " na lista");

        System.out.println("=== Removendo um produto ===");
        produtos.remove(2);

        System.out.println("=== Verificando se a lista esta vazia ===");
        if (produtos.isEmpty()) {
            System.out.println("A lista esta vazia!");
        }
        else {
            System.out.println("A lista nao esta vazia!");
        }
    }
}
