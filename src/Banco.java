import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco() {
		contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(Conta conta) {
		
		this.contas.add(conta) ;
	}
	
	public List<Cliente> getClientes(List<Conta> contas) {
		List<Cliente>cl = new ArrayList<Cliente>();
		for (Conta conta : contas)
		{
			if ( ! cl.contains(conta.cliente))
			cl.add(conta.cliente);
		}
		
		return cl;
	}
	
	public void listarClientes() {
		if  ((! getContas().isEmpty()) && (getContas() != null) ) {
			List<Cliente> clientes = getClientes(getContas());
			for (Cliente cliente : clientes) {
				System.out.println("Cliente: " + cliente.getNome());
			}
		}else {
			System.out.println("Sem contas para listar ! ");
		}
		
		
	}
}
