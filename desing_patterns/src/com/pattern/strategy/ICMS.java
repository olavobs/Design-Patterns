package com.pattern.strategy;

import com.pattern.utils.Orcamento;

public class ICMS implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.9 + 50;
	}

}
