package desafio_heranca.conta_bancaria;

public class ContaCorrente extends ContaBancaria {
    protected double tarifaMensal;

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada. Saldo atual: R$" + saldo);
    }
}
