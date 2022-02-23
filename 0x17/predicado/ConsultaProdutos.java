import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class ConsultaProdutos {

	public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterio) {

		Locale.setDefault(new Locale("pt", "BR"));

		ArrayList<Produto> produtosFiltrados = new ArrayList<Produto>();

		produtosFiltrados.forEach(listaProduto -> System.out.println(produtos));

		produtos.forEach(p -> {
			if (criterio.test(p)) {
				produtosFiltrados.add(p);
			}
		});

		return produtosFiltrados;

	}

}
