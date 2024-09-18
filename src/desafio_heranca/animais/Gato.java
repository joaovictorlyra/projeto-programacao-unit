package desafio_heranca.animais;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }

    public void arranharMoveis() {
        System.out.println("Estou arranhando móveis");
    }
}
