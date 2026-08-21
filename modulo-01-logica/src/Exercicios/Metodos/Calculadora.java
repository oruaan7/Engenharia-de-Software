package Exercicios.Metodos;

public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double resultadoSoma = somar(10, 5);
        System.out.println("Soma: " + resultadoSoma);

        double resultadoSubtracao = subtrair(10, 4);
        System.out.println("Subtracao: " + resultadoSubtracao);

        double resultadoMultiplicacao = multiplicar(5, 2);
        System.out.println("Multiplicacao: " + resultadoMultiplicacao);

        double resultadoDivisao = dividir(10, 2);
        System.out.println("Divisao: " + resultadoDivisao);
    }
}
