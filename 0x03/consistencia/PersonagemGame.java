
public class PersonagemGame {

	private int saudeAtual;
	private String nome;
	private String status;

	PersonagemGame(int saudeAtual, String nome) {

		setNome(nome);
		setSaudeAtual(saudeAtual);

	}

	public int getSaudeAtual() {
		return saudeAtual;
	}

	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;

		if (this.saudeAtual > 0) {

			status = "vivo";
		}

		else {

			status = "morto";
		}
	}

	public String getStatus() {
		return status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if ((nome != null) && (nome != "")) {

			this.nome = nome;

		}

	}

	public void tomarDano(int quantidadeDeDano) {

		setSaudeAtual(saudeAtual - quantidadeDeDano);

		if (saudeAtual < 0) {

			saudeAtual = 0;
		}

	}

	public void receberCura(int quantidadeDeCura) {

		setSaudeAtual(saudeAtual + quantidadeDeCura);

		if (saudeAtual > 100) {

			saudeAtual = 100;
		}

	}

}
