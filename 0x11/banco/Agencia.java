import java.util.ArrayList;
public class Agencia {
    public String nome;
    public ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        clientes =  new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public boolean novoCliente(String nomeCliente, double valor){
        Cliente clienteEncontrado = buscarCliente(nomeCliente);

       
        if(clienteEncontrado != null){
            return false;
        }
      
        Cliente novoCliente = new Cliente(nomeCliente,valor);
        clientes.add(novoCliente);

        return true;
    }

    public  boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao){
        Cliente clienteEncontrado = buscarCliente(nomeCliente);

      
        if(clienteEncontrado == null){
            return false;
        }
       
        clienteEncontrado.adicionarTransacao(valorTransacao);
        return true;
    }

    public Cliente buscarCliente(String nomeCliente){
        for (int i =0; i < this.clientes.size();i++){
            if (this.clientes.get(i).getNome().equals(nomeCliente)){
                return clientes.get(i);
            }
        }
        return null;
    }
    
}

