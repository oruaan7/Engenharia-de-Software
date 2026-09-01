package Exercicios;

public class Pessoa {

    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() +
                ", tenho " + getIdade() + " anos e moro em " + getCidade() + ".");
    }

    public void fazerAniversario() {
        idade++;
    }
}
