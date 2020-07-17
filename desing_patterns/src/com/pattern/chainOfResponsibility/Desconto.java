package com.pattern.chainOfResponsibility;

import com.pattern.utils.Orcamento;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
  }