import java.util.HashSet;
import java.util.TreeSet;

public class NumerosDuplicados {
	
	public static TreeSet <Integer> buscar (int [] numeros) {
		
		HashSet<Integer> numerosEncontrados = new HashSet<>();
		TreeSet<Integer> duplicados = new TreeSet<>();
	
	
	for (Integer i: numeros) {
		
		if (!numerosEncontrados.add(i)) {
			
			duplicados.add (i);
		}
	}
	
	return duplicados;

}

}