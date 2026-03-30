package entities;

public class FuncionarioHorista extends Funcionario {

	private Double horasTrabalhadas;
	private Double valorHora;

	public FuncionarioHorista(String nome, String cpf, Double salarioBase, Double horasTrabalhadas, Double valorHora) {
		super(nome, cpf, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public Double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public Double calcularSalario() {
		return  getSalarioBase() + getHorasTrabalhadas() * getValorHora();
	}

}
