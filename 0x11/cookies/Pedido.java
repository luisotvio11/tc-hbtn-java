import java.util.ArrayList;

public class Pedido {

	public	ArrayList<PedidoCookie> cookies;
	public Pedido () {
		
		cookies = new ArrayList<>();

	}

	public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {

		cookies.add(pedidoCookie);

	}

	public int obterTotalCaixas() {

		int totalCaixas = 0;

		for (PedidoCookie pedidoCookie : cookies) {

			totalCaixas += pedidoCookie.getQuantidadeCaixas();
		}

		return totalCaixas;

	}

	public int removerSabor(String saborCookie) {

		int caixasRemovidas = obterTotalCaixas();

		cookies.removeIf(caixaRemovidas -> caixaRemovidas.getSabor().equals(saborCookie));

		return caixasRemovidas - obterTotalCaixas();

	}

}
