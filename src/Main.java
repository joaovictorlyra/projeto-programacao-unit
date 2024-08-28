public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345", 1000.0);
        ContaBancaria conta2 = new ContaBancaria("67890", 500.0);

        conta1.depositar(250.0);
        conta1.sacar(100.0);
        conta2.depositar(300.0);
        conta2.sacar(700.0);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
