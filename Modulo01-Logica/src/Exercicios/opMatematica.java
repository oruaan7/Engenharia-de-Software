package Exercicios;

// Problema: fazer um sistema executar operacoes matematicas.
// Entrada: inteiros a, b;
// Processamento: executar a operacao soma, subtracao, multi, div e resto de A e B.
// Saida: mostrar o resultado de cada op.
public class opMatematica {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        // operacoes
        int soma = a + b;
        int sub = a - b;
        int multip = a * b;
        int div = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + multip);
        System.out.println("Divisao: " + div);
        System.out.println("Resto: " + resto);
    }
}
