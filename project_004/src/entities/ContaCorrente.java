package entities;

public class ContaCorrente extends Conta {

	private boolean chequeEspecial;

	public ContaCorrente(int number, int agencia, double saldo, boolean chequeEspecial) {
		super(number, agencia, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	
	
	
	
}
