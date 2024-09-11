package aula1109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    //4. Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e
//    modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
    private String nome;
    private List<Double> notas = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularMedia(List<Double> notas) {
        System.out.println("Informe a quantidade de notas:");
        int qtdeNotas = sc.nextInt();
        sc.nextLine();

        double soma = 0;

        for (int i = 1; i <= qtdeNotas; i++) {
            System.out.println("Informe a nota " + i);
            var nota = sc.nextDouble();
            notas.add(nota);

            sc.nextLine();
        }

        for (Double nota : notas) {
            soma += nota;
        }

        return soma / qtdeNotas;
    }
}
