package Exercicios.Matrizes;

public class Matriz02 {
    public static void main(String[] args) {

        int[][] matriz02 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int soma = 0;

        System.out.print("Soma dos elementos da matriz: ");
        for (int i = 0; i < matriz02.length; i++) {
            for (int j = 0; j < matriz02.length; j++) {
                soma += matriz02[i][j];
            }
        }
        System.out.print(soma);
    }
}
