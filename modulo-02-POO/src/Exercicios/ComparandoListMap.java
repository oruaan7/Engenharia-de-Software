package Exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparandoListMap {
    public static void main(String[] args) {
        List<Par<String, Double>> notasLista = new ArrayList<>();

        notasLista.add(new Par<>("Ruan", 9.5));
        notasLista.add(new Par<>("Carlos", 7.0));
        notasLista.add(new Par<>("Maria", 8.5));
        notasLista.add(new Par<>("Joao", 6.0));

        for (Par<String, Double> notaLista : notasLista) {
            System.out.println(notaLista.getChave() + " -> " + notaLista.getValor());
        }

        System.out.println("=== Nota de Maria ===");
        for (Par<String, Double> notaLista : notasLista) {
            if (notaLista.getChave().equals("Maria")) {
                System.out.println(notaLista.getValor());
            }
        }

        System.out.println("=== Media ===");
        double soma = 0;
        for (Par<String, Double> notaLista : notasLista) {
            soma += notaLista.getValor();
        }
        double media = soma / notasLista.size();
        System.out.println("Media: " + media);

        System.out.println("======================");

        Map<String, Double> notasMap = new HashMap<>();

        notasMap.put("Ruan", 9.5);
        notasMap.put("Carlos", 7.0);
        notasMap.put("Maria", 8.5);
        notasMap.put("Joao", 6.0);

        System.out.println(notasMap.entrySet());

        System.out.println("Nota de Maria: " + notasMap.get("Maria"));

        double somaMap = 0;
        for (double nota : notasMap.values()) {
            somaMap += nota;
        }

        double mediaMap = somaMap / notasMap.size();
        System.out.println("Media: " + mediaMap);
    }
}
