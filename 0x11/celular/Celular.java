import java.util.ArrayList;

public class Celular {

	private ArrayList<Contato> listaContatos;

	public Celular() {

		this.listaContatos = new ArrayList<Contato>();

	}

	public Integer obterPosicaoContato(String nome) {

		for (int i = 0; i < this.listaContatos.size(); i++) {

			if (this.listaContatos.get(i).getNome().equals(nome)) {

				return i;
			}

		}
		return null;

	}

	public void adicionarContato(Contato contato) {

		if (buscarContato(contato.getNome()) != null) {

			throw new IllegalArgumentException(
					"Nao foi possivel adicionar contato. Contato jah existente com esse nome");
		}

		listaContatos.add(contato);
	}

	public void atualizarContato(Contato contatoAntigo, Contato novoContato) {

		Contato contatoEncontrado = buscarContato(contatoAntigo.getNome());

		if (contatoEncontrado == null) {

			throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
		}

		else if (contatoAntigo.getNome() != novoContato.getNome() &&

				buscarContato(novoContato.getNome()) != null) {

			throw new IllegalArgumentException(
					"Nao foi possivel modificar contato. Contato jah existente com esse nome");

		}

		Integer posicaoContato = obterPosicaoContato(contatoAntigo.getNome());

		this.listaContatos.set(posicaoContato, novoContato);
	}

	public Contato buscarContato(String nome) {
		Integer posicaoContato = obterPosicaoContato(nome);
		if (posicaoContato == null)
			return null;

		return listaContatos.get(posicaoContato);

	}

	public void removerContato(Contato contato) {
		Integer posicaoContato = obterPosicaoContato(contato.getNome());
		if (posicaoContato == null) {
			throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
		}

		this.listaContatos.remove(posicaoContato.intValue());

	}

	public void listarContatos() {

		for (int j = 0; j < this.listaContatos.size(); j++) {
			System.out.println(this.listaContatos.get(j).getNome() + " -> "
					+ this.listaContatos.get(j).getNumeroTelefone() + " (" + this.listaContatos.get(j).getTipo() + ")");
		}
	}

}
