package Exercicios;

public abstract class Animal {
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

    public abstract void emitirSom();
}
