package Aula03.Exercicios;

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Digite a sua nota para ver a Classificacao: ");
        nota = sc.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
            case 6:
                System.out.println("Regular");
                break;
            case 7:
                System.out.println("Bom");
                break;
            case 8:
                System.out.println("Muito bom");
                break;
            case 9:
            case 10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Nota invalida");
        }

        sc.close();
    }
}
