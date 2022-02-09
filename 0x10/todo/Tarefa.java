public class Tarefa {

	private String descricao;
	private boolean estahFeita;
	private int identificador;

	public Tarefa(String descriacao, int identificador) {

		this.descricao = descriacao;
		this.identificador = identificador;

	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isEstahFeita() {
		return estahFeita;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setEstahFeita(boolean estahFeita) {
		this.estahFeita = estahFeita;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void modificadorDescricao(String descricaoAtualizada) throws IllegalAccessException {

		if (descricaoAtualizada.isEmpty() || descricaoAtualizada != null);

		throw new IllegalArgumentException("Descricao de tarefa invalida");

	}
	
  
	
	
}



