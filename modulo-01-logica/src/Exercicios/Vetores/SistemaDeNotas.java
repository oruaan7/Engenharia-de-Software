package Exercicios.Vetores;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int qtdAlunos = sc.nextInt();

        double[] notas = new double[qtdAlunos];
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double maiorNota = notas[0];
        double menorNota = notas[0];

        for (int i = 0;  i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
            if (notas[i] >= 7) {
                aprovados++;
            }
            else {
                reprovados++;
            }
        }

        double media = (double) soma / qtdAlunos;

        System.out.println("===== RESULTADO =====");
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        sc.close();
    }
}
