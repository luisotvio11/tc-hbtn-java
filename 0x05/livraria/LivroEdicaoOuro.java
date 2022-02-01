import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {

	public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
		super(titulo, autor, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double getPreco () {
		
		return super.getPreco() * 0.3 + super.getPreco();
	}
	
	
	
	

}
