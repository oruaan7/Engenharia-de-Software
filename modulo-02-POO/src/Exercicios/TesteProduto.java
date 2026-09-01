package Exercicios;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado", 150, 10);

        produto.exibirInfo();

        produto.adicionarEstoque(5);

        produto.removerEstoque(3);

        produto.removerEstoque(100);

        produto.calcularValorTotal();
    }
}
