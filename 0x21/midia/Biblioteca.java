import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia> {

    private List <T>  listaValores =  new ArrayList<>();

    public Biblioteca() {
    }

    public void adicionarMidia (T tipoMidia) {

        listaValores.add(tipoMidia);
    }

    public List <T> obterListaMidias () {

        return listaValores;
    }

}
