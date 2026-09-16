// Problema: Fazer a conversao de um preco para int
// Entrada: nenhuma
// Processamento: converter o valor de preco de double p/ int
// Saida: mostrar valores: original, convertido

package Aula02.Exercicios;

public class Conversao {
    public static void main(String[] args) {
        double preco = 19.99;

        System.out.println("Preco original: R$" + preco);

        // Conversao
        int valorConvetido = (int) preco;
        System.out.println("Valor convertido: " + valorConvetido);
        // Explicacao dos cents: Quando um valor double e convertido para int, as casas decimais sao "perdidas" porque o numero deixou de ser decimal
    }
}
