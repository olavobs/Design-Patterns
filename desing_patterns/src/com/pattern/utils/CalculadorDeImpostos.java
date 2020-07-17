package com.pattern.utils;

import com.pattern.strategy.Imposto;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

		double valor = imposto.calculaImposto(orcamento);

		System.out.println(valor);

	}

}