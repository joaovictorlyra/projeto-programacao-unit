package aula1109;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void addDesconto(double percentualDesconto) {
        this.preco = (this.preco * (percentualDesconto/100)) - this.preco;
    }
}
