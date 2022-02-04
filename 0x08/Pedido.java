public class Pedido {
	
	private int percentualDesconto;
	private ItemPedido[] itens;
	private int total;

	public Pedido(int percentualDesconto, ItemPedido[] itens) {
		
		super();
		this.percentualDesconto = percentualDesconto;
		this.itens = itens;
	}
	
	
	public double calcularTotal () {
		
		double total = 0;
		
		for(ItemPedido itempedido : itens) {
			
		
			total = total + itempedido.getQuantidade() * itempedido.getProduto().obterPrecoLiquido();		
			
		}
		
		return total - (total * percentualDesconto/100);
		
	}

}
