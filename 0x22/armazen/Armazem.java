import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Armazem<T> implements Armazenavel<T> {

	private Map<String, T> itensArmazenados;

	public Armazem() {
		this.itensArmazenados = new TreeMap<>();
	}

	@Override
	public void adicionarAoInventario(String nome, T valor) {

		itensArmazenados.put(nome, valor);
	}

	@Override
	public T obterDoInventario(String nome) {

		return itensArmazenados.get(nome);

	}

}
