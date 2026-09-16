package Exercicios;// Problema: Fazer um conversor de temperatura Celsius -> Fahrenheit
// Entradas: temperatura
// Processamento: F = ( temperatura * 9 / 5 ) + 32
// Saida: F

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura;

        // Leitura da temperatura
        System.out.println("Digite a temperatura em Celsius: ");
        temperatura = sc.nextDouble();

        double fahrenheit = (temperatura * 9 / 5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
