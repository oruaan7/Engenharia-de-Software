package Exercicios;

import java.util.HashMap;
import java.util.Map;

public class ExemploGenerics {

    public static void main(String[] args) {

        Map<String, Double> produtos = new HashMap<>();

        produtos.put("Martelo", 25.90);
        produtos.put("Machado", 45.50);
        produtos.put("Enxada", 30.00);

        System.out.println(produtos);
    }
}
