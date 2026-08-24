package Exercicios.Vetores;

import java.util.Scanner;

public class SistemaNotasComMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAlunos = sc.nextInt();

        double[] notas = new double[qtdAlunos];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double media = calcularMedia(notas);
        double maior = encontrarMaior(notas);
        double menor = encontrarMenor(notas);
        int aprovados = contarAprovados(notas);
        int reprovados = contarReprovados(notas);


        System.out.println("===== RESULTADO =====");
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        sc.close();

    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static double encontrarMaior(double[] notas) {
        double maior = notas[0];
        for (double nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }

    public static double encontrarMenor(double[] notas) {
        double menor = notas[0];
        for (double nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

    public static int contarAprovados(double[] notas) {
        int aprovados = 0;
        for (double nota : notas) {
            if (nota >= 7) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static int contarReprovados(double[] notas) {
        int reprovados = 0;
        for (double nota : notas) {
            if (nota < 7) {
                reprovados++;
            }
        }
        return reprovados;
    }
}
