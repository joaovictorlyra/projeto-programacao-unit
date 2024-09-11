package aula1109;

public class Livro {
    //5. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para
// acessar e
//    modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do título: " + titulo);
        System.out.println("Nome do autor: " + autor);
    }
}
