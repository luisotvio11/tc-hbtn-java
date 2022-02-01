import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

	public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
		super(numeracao, taxaJurosAnual);


	}
	
	private int quantidadeTransacoes;
	
	
	@Override
	public void depositar(double valor) throws OperacaoInvalidaException {
		
		
		if (valor <=0) {
			
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
		}
			
		
		saldo = saldo + valor - 0.1;
}
	
	
	@Override
	public void sacar(double valor) throws OperacaoInvalidaException  {
	
		

		
		
		if (valor < 0) {
			
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
		
		}
		
		
		else if (saldo < valor) {
			
			throw new OperacaoInvalidaException("Valor de saque deve ser maior que o saldo atual");
		}
		
		else {
			
			
			saldo = saldo - valor - 0.1;
		}
		
		
		
	}
	
	
	
		

	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes;
	}


	public void setQuantidadeTransacoes(int quantidadeTransacoes) {
		this.quantidadeTransacoes = quantidadeTransacoes;
	}
	
	
	
	

}
