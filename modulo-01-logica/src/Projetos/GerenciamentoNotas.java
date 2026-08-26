package Projetos;

import java.util.Scanner;

public class GerenciamentoNotas {
    // O Sistema devera funcionar atraves de um menu
    // Cadastrar Notas: Ler qtdAlunos, utilizar um array (double) para guardar notas dos alunos.
    // Listar Notas: Mostrar as notas dos alunos.
    // Calcular Media: mostrar media da turma.
    // Maior Nota
    // Menor nota
    // Mostrar aprovados ( nota >= 7 )
    // Mostrar Reprovados ( nota < 7 )
    // Mostrar Estatisticas: qtdAlunos, Media, Maior nota e menor nota, aprovados e reprovados.
    // Sair...

    // Regras: Utilizar ( scanner, variaveis, tipos de dados, if/else, switch, do-while, for, arrays, metodos.
    // Metodos: calcularMedia, encontrarMaior, encontrarMenor, contarAprovados, contarReprovados, listarNotas

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAlunos = sc.nextInt();

        double[] notas = new double[qtdAlunos];

        boolean notasCadastradas = false;

        int opcao = 0;
        do {
            System.out.println("===== SISTEMA DE NOTAS =====");
            System.out.println("1 - Cadastrar Notas");
            System.out.println("2 - Listar notas");
            System.out.println("3 - Calcular media");
            System.out.println("4 - Mostrar maior nota");
            System.out.println("5 - Mostrar menor nota");
            System.out.println("6 - Mostrar aprovados");
            System.out.println("7 - Mostrar reprovados");
            System.out.println("8 - Exibir estatisticas");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Escolha uma das opcoes acima: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarNotas(notas, sc);
                    notasCadastradas = true;
                    break;
                case 2:
                    if (!notasCadastradas) System.out.println("Cadastre as notas primeiro!");
                    else listarNotas(notas);
                    break;
                case 3:
                    if (!notasCadastradas) System.out.println("Cadastre as notas primeiro!");
                    else System.out.printf("Média da turma: %.2f%n", calcularMedia(notas));
                    break;
                case 4:
                    if (!notasCadastradas) System.out.println("Cadastre as notas primeiro!");
                    else System.out.printf("Maior nota: %.2f%n", maiorNota(notas));
                    break;
                case 5:
                    if (!notasCadastradas) System.out.println("Cadastre as notas primeiro!");
                    else System.out.printf("Menor nota: %.2f%n", menorNota(notas));
                    break;
                case 6:
                    if (!notasCadastradas) System.out.println("Cadastre as notas primeiro!");
                    else System.out.println("Aprovados: " + contarAprovados(notas));
                    break;
                case 7:
                    if (!notasCadastradas) System.out.println("Cadastre as notas primeiro!");
                    else System.out.println("Reprovados: " + contarReprovados(notas));
                    break;
                case 8:
                    if (!notasCadastradas) System.out.println("Cadastre as notas primeiro!");
                    else exibirEstatisticas(notas);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static void cadastrarNotas(double[] notas, Scanner sc) {
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite novamente.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
    }

    public static void listarNotas(double[] notas) {
        System.out.println("===== NOTAS =====");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
        }
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static double maiorNota(double[] notas) {
        double maior = notas[0];
        for (double nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }

    public static double menorNota(double[] notas) {
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

    public static void exibirEstatisticas(double[] notas) {
        int qtdAlunos = notas.length;
        double media = calcularMedia(notas);
        double maior = maiorNota(notas);
        double menor = menorNota(notas);
        int aprovados = contarAprovados(notas);
        int reprovados = contarReprovados(notas);

        System.out.println("===== ESTATÍSTICAS =====");
        System.out.println("Quantidade de alunos: " + qtdAlunos);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Maior nota: %.2f%n", maior);
        System.out.printf("Menor nota: %.2f%n", menor);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }
}
