package entities.interfaces;

public interface IConta {

	void withdraw(Double value);
	void deposit(Double value);
	void transfer(Double value, IConta account);
	void printStatement();
}
