package entities;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	private Double salarioBase;

	public Funcionario(String nome, String cpf, Double salarioBase) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public abstract Double calcularSalario();
}
