package entities;

public class ContaPoupanca extends Conta {
	private double rendimento;

	public ContaPoupanca(int number, int agencia, double saldo, double rendimento) {
		super(number, agencia, saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
}
