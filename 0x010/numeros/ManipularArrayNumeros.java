import java.util.List;

public class ManipularArrayNumeros {

	public static int buscarPosicaoNumero(List<Integer> listas, int numero) {

		if (listas.contains(numero)) {

			return listas.indexOf(numero);
		}

		return -1;

	};

	public static void adicionarNumero(List<Integer> integers, int numero) {

		if (integers.contains(numero)) {

			throw new IllegalArgumentException("Numero jah contido na lista");

		}

		integers.add(numero);

	}

	public static void removerNumero(List<Integer> integers, int numero) {

		if (!integers.contains(numero)) {

			throw new IllegalArgumentException("Numero nao encontrado na lista");
		}

		integers.remove(integers.indexOf(numero));

	}

	public static void substituirNumero (List<Integer> integers, int numeroSubstituir, int numeroSubstituto) {
		
		
		if (integers.contains(numeroSubstituir)) {
			
			integers.set(integers.indexOf(numeroSubstituir), numeroSubstituto);		
		}
		
		else {
			
			integers.add(numeroSubstituto);
		}
		
	}
	
	
}
