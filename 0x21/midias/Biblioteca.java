import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia> {

    private List <T>  listaValores ;

    public Biblioteca() {
        this.listaValores = new ArrayList<>();
    }

    public void adicionarMidia (T tipoMidia) {

        listaValores.add(tipoMidia);
    }

    public List <T> obterListaMidias () {

        return listaValores;
    }

}
