package Aula03.Exercicios;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite um numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " e maior que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " e maior que " + numero1);
        } else {
            System.out.println("Os dois numeros sao iguais!");
        }

        sc.close();
    }
}
