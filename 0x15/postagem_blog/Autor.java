public class Autor implements Comparable {
    private String nome;
    private String sobrenome;
    
    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String toString() {
        return String.format("%s %s", this.nome, this.sobrenome);
    }

    @Override
    public int compareTo(Object obj) {
        Autor autor = (Autor) obj;
        return this.toString().compareTo(autor.toString());
    }
}
