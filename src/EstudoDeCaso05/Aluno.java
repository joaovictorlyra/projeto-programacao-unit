package EstudoDeCaso05;

public class Aluno {
    private String nome;
    private int idade;



    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibeFicha() {
        System.out.printf("Nome: %s | Idade: %d%n", nome, idade);
    }
}
