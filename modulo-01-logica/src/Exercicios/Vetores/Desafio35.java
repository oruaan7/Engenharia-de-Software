package Exercicios.Vetores;

import java.util.Scanner;

public class Desafio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int qtd = sc.nextInt();

        int[] idades = new int[qtd];


        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
        }

        System.out.println("Média das idades: " + calcularMedia(idades));
        System.out.println("Maior idade: " + encontrarMaior(idades));
        System.out.println("Menor idade: " + encontrarMenor(idades));
        System.out.println("Maiores de idade: " + contarMaioresDeIdade(idades));
        System.out.println("Menores de idade: " + contarMenoresDeIdade(idades));

        sc.close();
    }

    public static double calcularMedia(int[] idades) {
        int soma = 0;
        for (int idade : idades) {
            soma += idade;
        }
        return (double) soma / idades.length;
    }

    public static int encontrarMaior(int[] idades) {
        int maior = idades[0];
        for (int idade : idades) {
            if (idade > maior) {
                maior = idade;
            }
        }
        return maior;
    }

    public static int encontrarMenor(int[] idades) {
        int menor = idades[0];
        for (int idade : idades) {
            if (idade < menor) {
                menor = idade;
            }
        }
        return menor;
    }

    public static int contarMaioresDeIdade(int[] idades) {
        int cont = 0;
        for (int idade : idades) {
            if (idade >= 18) {
                cont++;
            }
        }
        return cont;
    }

    public static int contarMenoresDeIdade(int[] idades) {
        int cont = 0;
        for (int idade : idades) {
            if (idade < 18) {
                cont++;
            }
        }
        return cont;
    }
}

