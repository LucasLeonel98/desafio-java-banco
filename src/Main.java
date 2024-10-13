
public class Main {

	public static void main(String[] args) {
		try {
			Cliente venilton = new Cliente();
			venilton.setNome("Venilton");
			
			Cliente lucas = new Cliente();
			lucas.setNome("Lucas");
			
			Cliente marcelo = new Cliente();
			marcelo.setNome("Marcelo");
			
			Banco banco = new Banco();
			
			Conta cc = new ContaCorrente(venilton, banco);
			Conta poupanca = new ContaPoupanca(venilton, banco);
			
			Conta contaCorrente = new ContaCorrente(lucas, banco);
		
			Conta contaCorrente1 = new ContaCorrente(lucas, banco);
			
			Conta contaCorrente2 = new ContaCorrente(marcelo, banco);
			
			
			cc.depositar(100);
			cc.transferir(100, poupanca);
			
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
			
			
			banco.listarClientes();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
	}

}
