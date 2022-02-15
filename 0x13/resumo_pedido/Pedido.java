import provedores.Frete;

public class Pedido {

	private int pedido;
	private int peso;
	private double total;
	private Frete frete;
	
	
	
	public Pedido(int pedido, int peso, double total) {
		super();
		this.pedido = pedido;
		this.peso = peso;
		this.total = total;
	}
	public int getPedido() {
		return pedido;
	}
	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
}
