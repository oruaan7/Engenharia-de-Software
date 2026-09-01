package Exercicios;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para deposito!");
        }
        else {
            saldo += valor;
            System.out.println("Depositando R$ " + valor);
            exibirSaldo();
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Sacando R$ " + valor);
            exibirSaldo();
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
