import java.util.TreeMap;

public class AnalisadorFrase {
	
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> resultadoContagem = new TreeMap<>();

        String[] palavras = frase
                                .toLowerCase()
                                .replace("!", "")
                                .replace(".", "")
                                .replace("?", "")
                                .split(" ");

        for(String palavrass : palavras) {
            if (resultadoContagem.containsKey(palavrass)) {
                resultadoContagem.put(palavrass, resultadoContagem.get(palavrass) + 1);
            } else {
                resultadoContagem.put(palavrass, 1);
            }
        }

        return resultadoContagem;
    }
}
