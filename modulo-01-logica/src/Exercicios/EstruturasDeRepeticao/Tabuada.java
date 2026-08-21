package Exercicios.EstruturasDeRepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int tabuada;
        System.out.print("Digite um numero para ver a tabuada do mesmo: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }

        sc.close();
    }
}
