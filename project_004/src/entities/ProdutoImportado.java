package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProdutoImportado extends Produto {

	public ProdutoImportado(String name, BigDecimal precoBase) {
		super(name, precoBase);
	}

	@Override
	public BigDecimal calcularPrecoFinal() {
		return getPrecoBase().multiply(new BigDecimal("1.10"))
				.add(new BigDecimal("50.00"))
				.setScale(2, RoundingMode.HALF_UP);
	}

}
