package Exercicios;

public class Pedido {
    private int numero;
    private String cliente;
    private StatusPedido status;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.status = StatusPedido.PENDENTE;
    }

    public void pagar() {
        if (status == StatusPedido.PENDENTE) {
            System.out.println("Pagamento realizado!");
            this.status = StatusPedido.PAGO;
        }
        else {
            System.out.println("O pedido nao pode ser pago!");
            System.out.println("Motivo: " + status);
        }
    }

    public void enviar() {
        if (status == StatusPedido.PAGO) {
            System.out.println("Pedido Enviado!");
            this.status = StatusPedido.ENVIADO;
        }
        else {
            System.out.println("Nao foi possivel enviar o pedido.");
            exibirStatus();
        }
    }

    public void entregar() {
        if (status == StatusPedido.ENVIADO) {
            System.out.println("Pedido Entregue!");
            this.status = StatusPedido.ENTREGUE;
        }
        else {
            System.out.println("O pedido ainda nao foi enviado!");
            exibirStatus();
        }
    }

    public void cancelar() {
        if (status == StatusPedido.ENTREGUE) {
            System.out.println("Pedido ja foi entregue e nao podera ser cancelado!");
            exibirStatus();
        } else if (status == StatusPedido.CANCELADO) {
            System.out.println("O pedido ja esta cancelado!");
            exibirStatus();
        }
        else {
            System.out.println("Pedido Cancelado!");
            this.status = StatusPedido.CANCELADO;
        }
    }

    public void exibirStatus() {
        System.out.println("Status: " + status);
    }
}
