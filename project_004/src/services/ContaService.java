package services;

import java.util.List;
import entities.Conta;

public class ContaService {

	public double calcularRendimento(List<Conta> contas) {
		return contas.stream().mapToDouble(Conta::getSaldo).sum();

	}

	public List<Conta> saldosPositivos(List<Conta> contas) {
		return contas.stream().filter(n -> n.getSaldo() > 0).toList();
	}

}
