package Exercicios.LogicaBasica;

public class Salario {
    public static void main(String[] args) {

        double salario = 2500;
        int horasExtras = 10;
        int valorHoraExtra = 30;

        double salarioFinal = salario + (horasExtras * valorHoraExtra);

        System.out.printf("Salario Final: %.2f", salarioFinal);
    }
}
