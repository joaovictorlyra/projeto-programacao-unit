package EstudoDeCaso06;

public class EstudoDeCaso06 {
    public static void main(String[] args) {
        Fruta fruta01 = new Fruta("Maçã");
        Fruta fruta02 = new Fruta("Banana");
        Fruta fruta03 = new Fruta("Uva");

        Inventario inventario = new Inventario();

        inventario.addFruta(fruta01);
        inventario.addFruta(fruta02);
        inventario.addFruta(fruta03);

        inventario.exibeInventario();

    }
}
