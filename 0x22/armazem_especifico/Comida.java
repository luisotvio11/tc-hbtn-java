import java.util.Locale;

public class Comida {

	private String nome;
	private double calorias;
	private double preco;

	public Comida(String nome, double calorias, double preco) {
		super();
		this.nome = nome;
		this.calorias = calorias;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getCalorias() {
		return calorias;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "[" + this.nome + "] " + String.format("%f", this.calorias) + " R$ " + String.format("%f", this.preco);
	}

}
