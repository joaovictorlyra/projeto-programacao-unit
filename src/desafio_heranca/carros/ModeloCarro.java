package desafio_heranca.carros;

public class ModeloCarro extends Carro {
    double aumentoPreco; //Aumento de preço do novo modelo

    public void setAumentoPreco(double aumentoPreco) {
        this.aumentoPreco = aumentoPreco;
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco + aumentoPreco);
    }

    public void exibeFicha () {
        System.out.println("Nome do modelo: " + getModelo());
        System.out.println("Preço do carro: " + getPreco());
    }
}
