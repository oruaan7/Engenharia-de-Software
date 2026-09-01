package Exercicios;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Maria", 25, "São Paulo");

        pessoa1.apresentar();

        pessoa1.fazerAniversario();

        pessoa1.apresentar();

        pessoa1.setNome("Maria Clara");
        pessoa1.setCidade("Rio de Janeiro");

        pessoa1.apresentar();
    }
}
