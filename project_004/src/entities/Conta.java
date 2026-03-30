package entities;

public class Conta {
	private int number;
	private int agencia;
	private double saldo;
	
	public Conta(int number, int agencia, double saldo) {
		super();
		this.number = number;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
