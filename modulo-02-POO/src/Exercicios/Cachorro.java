package Exercicios;

public class Cachorro extends Animal implements PodeNadar {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " esta latindo: Au Au!");
    }

    @Override
    public void nadar() {
        System.out.println("O " + nome + " esta nadando!");
    }
}
