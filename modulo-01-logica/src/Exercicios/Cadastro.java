package Exercicios;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        String cidade;
        double salario;

        System.out.print("Digite seu nome completo: ");
        nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite sua cidade: ");
        cidade = sc.nextLine();

        System.out.print("Digite o seu salario: ");
        salario = sc.nextDouble();

        System.out.println("===== DADOS DO USUÁRIO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.printf("Salario: R$%.2f", salario);

        sc.close();
    }
}
