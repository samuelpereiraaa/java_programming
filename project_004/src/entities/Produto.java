package entities;

import java.math.BigDecimal;

public abstract class Produto {
	private String nome;
	private BigDecimal precoBase;

	public Produto(String name, BigDecimal precoBase) {
		super();
		this.nome = name;
		this.precoBase = precoBase;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public BigDecimal getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(BigDecimal precoBase) {
		this.precoBase = precoBase;
	}

	public abstract BigDecimal calcularPrecoFinal();
	
}
