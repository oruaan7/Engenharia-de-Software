package Exercicios.Metodos;

public class NumeroPar {
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(ehPar(11));
    }
}
