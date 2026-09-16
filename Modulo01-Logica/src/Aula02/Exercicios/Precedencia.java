// Problema: Mostrar os resultados de calculos utilizando a ordem de precedencia
// Entrada: nenhuma
// Processamento: calculos
// Saida: resultados dos calculos

package Aula02.Exercicios;

public class Precedencia {
    public static void main(String[] args) {
        int resultado1 = 10 + 5 * 2;
        int resultado2 = (10 + 5) * 2;
        int resultado3 = 20 / 4 + 3 * 2;
        int resultado4 = 20 / (4 + 3) * 2;

        // resultados: 1- 20, 2- 30, 3- 11, 4- 4

        System.out.println("1: " + resultado1);
        System.out.println("2: " + resultado2);
        System.out.println("3: " + resultado3);
        System.out.println("4: " + resultado4);

    }
}
