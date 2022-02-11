import java.util.ArrayList;

public class ProcessadorVideo {

	private ArrayList<CanalNotificacao> canais;
	
	public ProcessadorVideo () {
		
		this.canais = new ArrayList<>();
		
	}
	
	// recebendo objeto do tipo canalNotificao
	public void  registrarCanal (CanalNotificacao novaNotificacao) {
		
		canais.add(novaNotificacao);
		
	}
	
	public void processar (Video video) {
		
		String messageVideo = video.getArquivo() + " - " + video.getFormato();
		
		Mensagem mensagem = new Mensagem(messageVideo, TipoMensagem.LOG);
		
		
		for (CanalNotificacao notificacoes: this.canais) {
			
		notificacoes.notificar(mensagem);
			
		}
		
	
}

}