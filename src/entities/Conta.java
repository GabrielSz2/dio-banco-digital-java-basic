package entities;

import entities.interfaces.IConta;

public abstract class Conta implements IConta{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 100000;
	
	protected int agency;
	protected int number;
	protected double balance;
	protected Cliente client;
	
	public Conta (Cliente client) {
		this.agency = Conta.AGENCIA_PADRAO;
		this.number = SEQUENCIAL++;
		this.client = client;
	}
	
	@Override
	public void withdraw(Double value) {
		this.balance -= value;
	}

	@Override
	public void deposit(Double value) {
		this.balance += value;
	}

	@Override
	public void transfer(Double value, IConta account) {
		this.balance -= value;
		account.deposit(value);
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	
	public void printInfos() {
		System.out.println("Titular: " + client.getName());
		System.out.println("Agência: " + String.format("%04d", this.agency));
		System.out.println("number: " + this.number);
		System.out.println("Saldo: " + this.balance);
	}
}
