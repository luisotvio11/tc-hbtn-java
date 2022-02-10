import java.util.ArrayList;

public class Celular {

	private ArrayList<Contato> contatos;

	public Celular() {

		this.contatos = new ArrayList<Contato>();

	}

	public Integer obterPosicaoContato(String nome) {

		for (int i = 0; i < this.contatos.size(); i++) {

			if (this.contatos.get(i).getNome().equals(nome)) {

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

		contatos.add(contato);
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

		this.contatos.set(posicaoContato, novoContato);
	}

	public Contato buscarContato(String nome) {
		Integer posicaoContato = obterPosicaoContato(nome);
		if (posicaoContato == null)
			return null;

		return contatos.get(posicaoContato);

	}

	public void removerContato(Contato contato) {
		Integer posicaoContato = obterPosicaoContato(contato.getNome());
		if (posicaoContato == null) {
			throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
		}

		this.contatos.remove(posicaoContato.intValue());

	}

	public void listarContatos() {

		for (int j = 0; j < this.contatos.size(); j++) {
			System.out.println(this.contatos.get(j).getNome() + " -> " + this.contatos.get(j).getNumeroTelefone() + " ("
					+ this.contatos.get(j).getTipo() + ")");
		}
	}

}
