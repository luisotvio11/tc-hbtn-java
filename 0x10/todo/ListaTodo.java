import java.util.ArrayList;

public class ListaTodo {

	public ArrayList<Tarefa> tarefas;

	public ListaTodo() {

		this.tarefas = new ArrayList<>();
	}

	public void adicionarTarefa(Tarefa tarefa) {

		if (tarefa.getDescricao().isEmpty()) {

			throw new IllegalArgumentException("Descricao de tarefa invalida");
		}

		for (int i = 0; i < tarefas.size(); i++) {

			if (this.tarefas.get(i).getIdentificador() == tarefa.getIdentificador()) {

				throw new IllegalArgumentException(
						"Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");

			}
		}

		this.tarefas.add(tarefa);

	}

	public boolean marcarTarefaFeita(int identificador) {

		for (Tarefa tarefa : this.tarefas) {

			if (tarefa.getIdentificador() == identificador) {

				tarefa.setEstahFeita(true);
				return true;
			}
		}

		return false;

	}

	public boolean desfazerTarefa(Integer identificador) {

		for (Tarefa tarefa : this.tarefas) {

			if (tarefa.getIdentificador() == identificador) {

				tarefa.setEstahFeita(false);
				return true;

			}

		}

		return false;
	}

	public void desfazerTodas() {

		this.tarefas.forEach(task -> task.setEstahFeita(false));

	}

	public void fazerTodas() {

		this.tarefas.forEach(task -> task.setEstahFeita(true));
	}

	public void listarTarefas() {

		for (Tarefa task : this.tarefas) {

			if (task.isEstahFeita()) {
				System.out.println("[X]  Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());

			}

			else {

				System.out.println("[ ]  Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());
			}
		}

	}

}
