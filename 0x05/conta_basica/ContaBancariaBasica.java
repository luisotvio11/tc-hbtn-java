import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
	
	
	
	private String numeracao;
	private double saldo;
	private double taxaJurosAnual;
	
	
	public ContaBancariaBasica (String numeracao, double taxaJurosAnual) {
		
		
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual;
		saldo = 0;
		
	}
	
	
	
	
	public String getNumeracao() {
		return numeracao;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}
		
	
	public void depositar(double valor) throws OperacaoInvalidaException {
		
		if (valor <= 0 ) {
			
			throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
		}
				
				
					saldo =  +valor;	
			
			
		}
			
	 public void sacar(double valor) throws OperacaoInvalidaException {
	        if (valor < 0) {
	            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
	        } else if (saldo < valor) {
	            throw new OperacaoInvalidaException("Valor de saque deve ser maior que o saldo atual");
	        } else {
	            saldo -= valor;
	        }
	    }

	    public double calcularTarifaMensal() {
	        if ((saldo * 0.1) < 10) {
	            return saldo * 0.1;
	        } else {
	            return 10.00f;
	        }
	    }

	    public double calcularJurosMensal() {
	        if (saldo < 0) {
	            return 0.00f;
	        } else {
	            return saldo * ((taxaJurosAnual / 100) / 12);
	        }
	    }

	    public void aplicarAtualizacaoMensal() {
	        saldo = (saldo - calcularTarifaMensal() + calcularJurosMensal());
	    }

	}