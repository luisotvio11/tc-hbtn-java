import comida.Comida;
import humor.*;

public class Personagem {

    public int pontosDeFelicidade;

    public String obterHumorAtual() {
        if (pontosDeFelicidade < -5) {
            Humor humor = new Irritado();
            return humor.getClass().getSimpleName();
        } else if (pontosDeFelicidade > -5 && pontosDeFelicidade < 0) {
            Humor humor = new Triste();
            return humor.getClass().getSimpleName();
        } else if (pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15) {
            Humor humor = new Feliz();
            return humor.getClass().getSimpleName();
        } else if (pontosDeFelicidade > 15) {
            Humor humor = new MuitoFeliz();
            return humor.getClass().getSimpleName();
        } else {
            return "";
        }
    }

    public void comer(Comida[] comidas) {
        for (Comida comida : comidas) {
            pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual();
    }
    
}