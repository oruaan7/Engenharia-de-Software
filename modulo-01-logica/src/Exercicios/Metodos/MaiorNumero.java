package Exercicios.Metodos;

public class MaiorNumero {
    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {

        int resultado = maior(10, 25);

        System.out.println("Maior Numero: " + resultado);
    }
}
