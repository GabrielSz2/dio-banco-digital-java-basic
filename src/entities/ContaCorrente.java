package entities;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente client) {
		super(client);
	}
	
	@Override
	public void printStatement() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.printInfos();
	}

}
