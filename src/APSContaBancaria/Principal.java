package APSContaBancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria1 conta = new ContaBancaria1("12345-6");

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        conta.depositar(500.00);
        conta.sacar(100.00);
        conta.sacar(500.00);

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
