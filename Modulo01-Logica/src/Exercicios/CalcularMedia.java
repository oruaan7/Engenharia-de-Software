package Exercicios;// Problema: Calcular a média de três notas.
// Entrada: nota1, nota2, nota3
// Processamento: (nota1 + nota2 + nota3) / 3
// Saida: media das notas

import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura das notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        // Calculo
        double media;
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media: " + media);
    }
}
