package aula1109;

public class ContaBancaria {
    //     1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular
//            (publico). Implemente métodos getters e setters para os atributos privados.
    private double numeroConta;
    private double saldo;
    public String titular;

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
