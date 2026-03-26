package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProdutoNacional extends Produto {

	public ProdutoNacional(String nome, BigDecimal precoBase) {
		super(nome, precoBase);
	}

	@Override
	public BigDecimal calcularPrecoFinal() {

		return getPrecoBase().multiply(new BigDecimal("1.10"))
					.setScale(2, RoundingMode.HALF_UP);
	}

}
