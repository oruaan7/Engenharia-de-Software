package Projetos;


import java.util.Scanner;

public class SistemaAtendimentoLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("=== Sistema de Atendimento da Loja ===");
            System.out.println("1 -Realizar uma compra.");
            System.out.println("2- Verificar classificacao.");
            System.out.println("0- Sair");
            System.out.println();
            System.out.println("Escolha uma das opcoes acima.");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Valor da compra: R$");
                    double valorCompra = sc.nextDouble();

                    System.out.println("Nome do cliente: " + nome);
                    System.out.println("Idade: " + idade);
                    System.out.println("Valor da compra: R$" + valorCompra);

                    System.out.println("E estudante? (true/false): ");
                    boolean estudante = sc.nextBoolean();

                    double percentual = 0.0;

                    if (valorCompra >= 50) {
                        if (idade >= 60) {
                            percentual = 0.10;
                        } else if (estudante) {
                            percentual = 0.05;
                        } else {
                            percentual = 0.0;
                        }
                    }

                    double valorDesconto = valorCompra * percentual;
                    double valorFinal = valorCompra - valorDesconto;

                    System.out.println("Valor apos o desconto: R$" + valorFinal);

                    System.out.println("=== FORMA DE PAGAMENTO ===");
                    System.out.println("1 - Dinheiro");
                    System.out.println("2 - Cartão");
                    System.out.println("3 - PIX");
                    System.out.print("Escolha: ");
                    int pagamento = sc.nextInt();

                    switch (pagamento) {
                        case 1:
                            valorFinal -= valorFinal * 0.05;
                            break;
                        case 2:
                            break;
                        case 3:
                            valorFinal -= valorFinal * 0.03;
                            break;
                        default:
                            System.out.println("Opcao de pagamento invalida!");
                    }
                    System.out.println("Valor final da compra: R$" + valorFinal);
                    break;

                case 2:
                    System.out.println("Informe a idade: ");
                    int idadeClassificacao = sc.nextInt();

                    if (idadeClassificacao < 0 || idadeClassificacao > 120) {
                        System.out.println("Idade invalida.");
                    } else if (idadeClassificacao <= 12) {
                        System.out.println("Classificacao: Crianca.");
                    } else if (idadeClassificacao <= 17) {
                        System.out.println("Classificacao: Adolescente.");
                    } else if (idadeClassificacao <= 59) {
                        System.out.println("Classificacao: Adulto.");
                    } else {
                        System.out.println("Classificacao: Idoso.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (opcao != 0);

        sc.close();
    }
}
