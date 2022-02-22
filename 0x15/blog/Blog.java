import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
	
	private List<Post> posts;

	
	public Blog () {
		
		posts = new ArrayList<Post>();
	}
	
	public void adicionarPostagem (Post post) {
		
		posts.add (post);
	}
	
	public Set <String> obterTodosAutores () {
		
		Set<String> autores = new TreeSet <> ();
		
	
		for (Post post : posts) {
			
			autores.add(post.getAutor());
		}
		
		return autores;
	
	}
	
	public Map <String, Integer> obterContagemPorCategoria () {
		
		Map	<String, Integer> contagemPorCategoria = new TreeMap <> ();
		
		int contagemAtual;
		
		for (Post post: posts) {
			
			if (contagemPorCategoria.containsKey(post.getCategoria())){
				
				contagemAtual = contagemPorCategoria.get(post.getCategoria());
			}
			else {
				
				contagemAtual = 0;
			}
			
			contagemPorCategoria.put (post.getCategoria(), contagemAtual + 1);
		}
		
		return contagemPorCategoria;
	}
	

	
	

}
