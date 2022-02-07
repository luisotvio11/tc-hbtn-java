
public class InteiroPositivo {

	private int valor;

	public InteiroPositivo(int valor) {
		Integer valueInteger = valor;
		setValor(valueInteger);

	}

	public InteiroPositivo(String valor) {
		setValor(Integer.parseInt(valor));
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {

		if (valor < 0) {

			throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
		}

		this.valor = valor;

	}

	public boolean ehPrimo() {

		if (this.valor == 1) {

			return false;

		}

		for (int x = 2; x <= this.valor / 2; x++) {

			if (this.valor % x == 0 || this.valor == 1) {

				return false;
			}
		}

		return true;

	}

}
