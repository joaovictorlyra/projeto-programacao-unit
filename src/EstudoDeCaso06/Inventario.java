package EstudoDeCaso06;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Fruta> inventarioFrutas = new ArrayList<>();

    public void addFruta(Fruta fruta) {
        inventarioFrutas.add(fruta);
    }

    public void exibeInventario() {
        System.out.println("****** INVENTÁRIO *******");
        for (Fruta fruta: inventarioFrutas) {
            System.out.println(fruta);
        }
    }

}
