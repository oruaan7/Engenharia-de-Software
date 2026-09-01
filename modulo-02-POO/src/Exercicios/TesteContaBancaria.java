package Exercicios;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1, "Ruan", 1000);

        System.out.println("Conta criada!");
        System.out.println("Titular: " + conta.getTitular());
        conta.exibirSaldo();


        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(2000);

        conta.exibirSaldo();
    }
}
