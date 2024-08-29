package entities;

public class ContaPoupança extends Conta{

	public ContaPoupança(Cliente client) {
		super(client);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.printInfos();
	}
}
