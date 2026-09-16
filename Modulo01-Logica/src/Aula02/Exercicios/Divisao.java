// Problema: Calcular a divisao inteira, decimal e convetida para int de 2 numeros inteiros.
// Entrada: nenhuma
// Processamento: Calculos
// Saida: Resultado dos calculos

package Aula02.Exercicios;

public class Divisao {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int divInt =  a / b;
        double divDecimal = (double)  a / b;
        int divConvertida = (int) divDecimal;

        System.out.println("Divisao inteira: " + divInt);
        System.out.println("Divisao decimal: " + divDecimal);
        System.out.println("Resultado convertido: " + divConvertida );
    }
}
