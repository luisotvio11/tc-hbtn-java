
public class Mensagem {

	private String texto;
	private TipoMensagem tipoMensagem;


		
	 public Mensagem(String texto, TipoMensagem tipoMensagem) {
	        this.texto = texto;
	        this.tipoMensagem = tipoMensagem;
	    }

	public String getTipo() {
		return texto;
	}

	public void setTipo(String tipo) {
		this.texto = texto;
	}

	public TipoMensagem getTipoMensagem() {
		return tipoMensagem;
	}

	public void setTipoMensagem(TipoMensagem tipoMensagem) {
		this.tipoMensagem = tipoMensagem;
	}

}
