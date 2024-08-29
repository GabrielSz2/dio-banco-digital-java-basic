package application;

import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupança;
import entities.interfaces.IConta;

public class Program {
	
	public static void main(String[] args) {
		
		Cliente client = new Cliente();
		client.setName("Gabriel");
		IConta cc = new ContaCorrente(client);
		IConta cpp = new ContaPoupança(client);
		
		cc.deposit(150.00);
		cc.transfer(100.00, cpp);
		
		cc.printStatement();
		cpp.printStatement();
	}
}
