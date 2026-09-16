// Problema: Criar programa que declara uma variavel para cada info.
// Entrada: idade, salario, altura, nome, letraInicial, maiorDeIdade
// Processamento: tipar adequadamente cada entrada
// Saida: Imprimir todas as entradas

package Aula02.Exercicios;

import java.util.Scanner;

public class IdentificadorTipos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        double salario;
        double altura;
        String nome;
        char letraInicial;
        boolean maiorDeIdade;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite sua altura em metros: ");
        altura = sc.nextDouble();

        System.out.println("Qual o seu salario bruto? ");
        salario = sc.nextDouble();

        System.out.println("=== Ficha ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Salario atual: R$" + salario);

        maiorDeIdade = idade >= 18;
        System.out.println("Maior de Idade? " + maiorDeIdade);

        letraInicial = nome.charAt(0);
        System.out.println("Primeira letra do seu nome: " + letraInicial);

        sc.close();
    }
}
