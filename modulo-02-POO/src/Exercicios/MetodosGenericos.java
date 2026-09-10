package Exercicios;

public class MetodosGenericos {
    public static <T> void imprimir(T valor) {
        System.out.println(valor);
    }

    public static <T> T retornar(T valor) {
        return valor;
    }

    public static <T, U> void imprimirPar(T primeiro, U segundo) {
        System.out.println(primeiro);
        System.out.println(segundo);
    }

    public static void main(String[] args) {
        imprimir("Ola Mundo!");

        imprimir(123);

        double nota = retornar(9.5);
        System.out.println("Nota retornada: " + nota);

        boolean status = retornar(true);
        System.out.println("Status retornado: " + status);

        imprimirPar("Ruan", 24);
        imprimirPar(42, false);
    }
}
