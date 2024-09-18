package desafio_heranca.conta_bancaria;

public class ContaBancaria {
    protected double saldo;

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saldo após saque: " + saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Saldo após depósito: " + saldo);
    }

    public void consultarSaldo() {
        System.out.println("Saldo da conta: " + saldo);
    }
}
