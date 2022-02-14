import java.util.ArrayList;

import atividade.Atividade;

public class Workflow {
	
	private ArrayList<Atividade> listaworkflow;

	
	public Workflow () {
		
		this.listaworkflow = new ArrayList<>();
		
	}


	public void registrarAtividade (Atividade atividade) {
		
		listaworkflow.add(atividade);
	
	}


	public ArrayList<Atividade> getListaworkflow() {
		return listaworkflow;
	}



}
