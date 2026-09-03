package Exercicios;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, "Ruan");

        pedido.exibirStatus();
        pedido.pagar();
        pedido.exibirStatus();
        pedido.enviar();
        pedido.exibirStatus();
        pedido.entregar();
        pedido.exibirStatus();
    }
}
