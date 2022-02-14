import atividade.Atividade;

public class MaquinaWorkflow {
	
	
	
		public void executar (Workflow workflows) {
			
			
			for (Atividade listaworkflow: workflows.getListaworkflow()) {
				
				listaworkflow.executar();
			

			}
		
}

}