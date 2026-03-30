package entities;

public class FuncionarioAssalariado extends Funcionario {

	public FuncionarioAssalariado(String nome, String cpf, Double salarioBase) {
		super(nome, cpf, salarioBase);
	}

	@Override
	public Double calcularSalario() {
		return getSalarioBase();
	}
	
	
	
}
