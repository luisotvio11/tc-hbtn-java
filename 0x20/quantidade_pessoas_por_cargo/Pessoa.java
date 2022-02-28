import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

	private int codigo;
	private String nome;
	private String cargo;
	private int idade;
	private double salario;

	@Override
	public String toString() {
		return String.format("[%d] %s %s %d R$ %f", codigo, nome, cargo, idade, salario);
	}

	public Pessoa(int codigo, String nome, String cargo, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargo, codigo, idade, nome, salario);
	}

	public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public int getIdade() {
		return idade;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cargo, other.cargo) && codigo == other.codigo && idade == other.idade
				&& Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(salario) == Double.doubleToLongBits(other.salario);
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.getNome().compareTo(o.getNome());
	}

}
