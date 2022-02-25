import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {

	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		return pedido.getProdutos().stream().filter(p -> p.getCategoria() == CategoriaProduto.LIVRO).toList();
	}

	public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {

		return produtos.stream().max(Comparator.comparing(Produto::getPreco)).get();
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double valorProduto) {

		return produtos.stream().filter(p -> p.getPreco() >= valorProduto).collect(Collectors.toList());
	}

	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> listaPedidos) {
		return listaPedidos.stream()
				.filter(p -> p.getProdutos().stream().anyMatch(e -> e.getCategoria() == CategoriaProduto.ELETRONICO))
				.toList();
	}

}
