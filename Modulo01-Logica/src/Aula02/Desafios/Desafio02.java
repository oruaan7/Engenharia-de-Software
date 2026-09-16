package Aula02.Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double altura;
        double salario;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite sua altura em metros: ");
        altura = sc.nextDouble();

        System.out.println("Digite o seu salario: ");
        salario = sc.nextDouble();

        int salarioConvertido = (int) salario;

        System.out.println();
        System.out.println("=== INFORMACOES ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Salario: R$" + salario);
        idade++;
        System.out.println("Idade no proximo ano: " + idade);
        System.out.println("Salario convertido para inteiro: R$" + salarioConvertido);

        sc.close();
    }
}
