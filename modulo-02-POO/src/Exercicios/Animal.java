package Exercicios;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(nome + " esta comendo.");
    }

    public void dormir() {
        System.out.println(nome + " esta dormindo.");
    }

    public void emitirSom() {
        System.out.println(nome + " emitiu um som.");
    }
}
