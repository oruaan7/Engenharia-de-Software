package Exercicios;

public class TestePar {
    public static void main(String[] args) {
        Par<String, Double> produto = new Par<>("Martelo", 25.90);
        Par<Integer, String> produto2 = new Par<>(1, "Ruan");
        Par<String, Integer> produto3 = new Par<>("Chave-Inglesa", 6);

        System.out.println("Objeto n1");
        System.out.println("Chave: " + produto.getChave());
        System.out.println("Valor: " + produto.getValor());
        System.out.println();

        System.out.println("Objeto n2");
        System.out.println("Chave: " + produto2.getChave());
        System.out.println("Valor: " + produto2.getValor());
        System.out.println();

        System.out.println("Objeto n3");
        System.out.println("Chave: " + produto3.getChave());
        System.out.println("Valor: " + produto3.getValor());
    }
}
