
public class Telefone {
	private String codigoArea;
	private String numero;

	public Telefone(String codigoArea, String numero) {
		super();
		this.codigoArea = codigoArea;
		this.numero = numero;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {

		int resultadoHash = 7;
		resultadoHash = 31 * resultadoHash + (codigoArea == null ? 0 : codigoArea.hashCode());
		resultadoHash = 31 * resultadoHash + (numero == null ? 0 : numero.hashCode());

		return resultadoHash;

	}
	@Override
	public String toString () {
		
		return String.format("(%s) %s", this.codigoArea, this.numero);
	}
	

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		Telefone telefone = (Telefone) o;
		return (codigoArea.equals(telefone.codigoArea) && numero.equals(telefone.numero));
	}

}
