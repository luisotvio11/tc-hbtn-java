import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<T> {

	private String nomeDoArquivo;



	public SerializarEstudantes(String nomeDoArquivo) {
		super();
		this.nomeDoArquivo = nomeDoArquivo;
	}

	public void serializar(List<Estudante> listaEstudante) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo))) {

			oos.writeObject(listaEstudante);

		}

		catch (IOException e) {
			System.out.println("Nao foi possivel serializar");

		}

	}
	
	public List <Estudante> desserializar () throws FileNotFoundException, IOException {
		
		List <Estudante> listaEstudantes =new ArrayList<>();
		
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeDoArquivo))){
			

			return listaEstudantes = (List <Estudante>)ois.readObject();
			
		}
		
		catch (IOException ex) {
			
			System.out.println("Nao foi possivel desserializar");
		}
		
		catch (Exception ex) {
            System.out.println("Nao foi possivel desserializar");
		}
		
		
		return listaEstudantes;
	}
}
