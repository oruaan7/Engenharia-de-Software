package Exercicios;

public class TesteCaixa {
    public static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>("Java");
        Caixa<Integer> caixaInt = new Caixa<>(21);
        Caixa<Double> caixaDouble = new Caixa<>(9.5);

        System.out.println(caixaTexto.getValor());
        System.out.println(caixaInt.getValor());
        System.out.println(caixaDouble.getValor());
    }
}
