package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaNotas {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);
        notas.add(5.0);

        System.out.println("====== Notas ======");
        System.out.println(notas);


        System.out.println("====== Quantidade de Notas ======");
        System.out.println(notas.size());

        System.out.println("====== Media das Notas ======");
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();
        System.out.println(media);

        System.out.println("====== Maior e Menor nota");
        double maior = notas.getFirst();
        double menor = notas.getFirst();

        for (Double nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        System.out.println("Maior: " + maior);

        for (Double nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        System.out.println("Menor: " + menor);

        System.out.println("====== Alterando uma nota ======");
        notas.set(0, 9.5);
        System.out.println(notas);

        System.out.println("====== Removendo uma nota =======");
        notas.remove(2);
        System.out.println(notas);
    }
}
