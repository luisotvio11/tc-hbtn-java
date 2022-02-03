package comida;

public abstract class Comida {
	
	public Comida () {
		
		
		
	}

	protected int pontosDeFelicidade;

	public Comida(int pontosDeFelicidade) {

		this.pontosDeFelicidade = pontosDeFelicidade;
	}

	public int getPontosDeFelicidade() {
		return pontosDeFelicidade;
	}

	public void setPontosDeFelicidade(int pontosDeFelicidade) {
		this.pontosDeFelicidade = pontosDeFelicidade;
	}

}
