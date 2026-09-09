package Exercicios;

import java.util.HashMap;
import java.util.Map;

public class NotasAlunos {
    public static void main(String[] args) {

        Map<String, Double> notas = new HashMap<>();

        notas.put("Ruan", 9.5);
        notas.put("Carlos", 7.0);
        notas.put("Maria", 8.5);
        notas.put("Joao", 6.0);
        notas.put("Ana", 10.0);

        System.out.println("=== Mostrando nota ===");
        System.out.println(notas.get("Ruan"));
        System.out.println();

        System.out.println("=== Verificando se Maria existe ===");
        if (notas.containsKey("Maria")) {
            System.out.println("Maria esta na listagem de notas!");
        } else {
            System.out.println("Maria nao esta na listagem de notas!");
        }
        System.out.println();

        System.out.println("=== Verificando nota ===");
        if (notas.containsValue(10.0)) {
            System.out.println("10.0 existe");
        } else {
            System.out.println("10.0 nao existe");
        }
        System.out.println();

        System.out.println("=== Alterando a nota de Carlos ===");
        notas.put("Carlos", 8.0);
        System.out.println();

        System.out.println("=== Removendo Joao ===");
        notas.remove("Joao");
        System.out.println("Joao foi removido!");
        System.out.println();

        System.out.println("=== Quantidade de alunos ===");
        System.out.println(notas.size());
        System.out.println();

        System.out.println("=== Percorendo Map ===");
        for (Map.Entry<String, Double> nota : notas.entrySet()) {
            System.out.println(nota.getKey() + " -> " + nota.getValue());
        }

        System.out.println("=== Calculando media ===");
        double soma = 0;
        for (Double nota : notas.values()) {
            soma += nota;
        }

        double media = soma / notas.size();
        System.out.println("Media: " + media);
    }
}
