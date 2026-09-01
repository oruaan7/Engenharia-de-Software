package Exercicios;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Valor invalido para ser colocado como preco de um produto");
        } else {
            this.preco = preco;
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida!");
        } else {
            this.quantidade += quantidade;
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade invalida!");
        } else if (quantidade > this.quantidade) {
            System.out.println("Quantidade insuficiente para ser removida!");
        } else {
            this.quantidade -= quantidade;
        }
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public void exibirInfo() {
        System.out.println("===== PRODUTO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Valor em estoque: R$ " + calcularValorTotal());
    }
}
