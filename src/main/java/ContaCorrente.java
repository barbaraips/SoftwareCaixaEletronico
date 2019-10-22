public class ContaCorrente {

	private int id;
	private double saldo;

	public ContaCorrente(int id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}

	double getSaldo() {
		return this.saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
