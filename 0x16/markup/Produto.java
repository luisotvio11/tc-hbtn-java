import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	private String nome;
	private double preco;
	private double percentualMarkup = 10;

	public Produto(double preco, String nome) {

		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPercentualMarkup() {
		return percentualMarkup;
	}

	public void setPercentualMarkup(int percentualMarkup) {
		this.percentualMarkup = percentualMarkup;
	}

	Supplier<Double> precoComMarkUp = () -> this.preco * (this.percentualMarkup + 100) / 100;

	Consumer<Double> atualizarMarkUp = x -> this.percentualMarkup = x;

}
