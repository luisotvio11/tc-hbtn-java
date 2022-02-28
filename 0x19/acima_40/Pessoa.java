public class Pessoa {
	
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
	
	
	

}
