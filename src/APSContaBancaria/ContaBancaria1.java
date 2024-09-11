package APSContaBancaria;

public class ContaBancaria1 {
    private String numeroConta;
    private double saldo;

    public ContaBancaria1(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: R$" + saldo);
            return true;
        } else {
            System.out.println("Saque inválido. Verifique o saldo ou o valor solicitado.");
            return false;
        }
    }
}
