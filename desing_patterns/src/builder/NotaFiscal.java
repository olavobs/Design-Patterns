package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial, cnpj, observacoes;
	private double valorBruto, impostos;
	private Calendar dataDaEmissao;
	private List<ItemDaNota> items = new ArrayList<ItemDaNota>();
	
	public NotaFiscal(String razaoSocial, String cnpj, String observacoes, double valorBruto, double impostos,
			Calendar dataDaEmissao, List<ItemDaNota> items) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDaEmissao = dataDaEmissao;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.items = items;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public Calendar getDataDaEmissao() {
		return dataDaEmissao;
	}

	public void setDataDaEmissao(Calendar dataDaEmissao) {
		this.dataDaEmissao = dataDaEmissao;
	}

	public List<ItemDaNota> getItems() {
		return items;
	}

	public void setItems(List<ItemDaNota> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "NotaFiscal [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", observacoes=" + observacoes
				+ ", valorBruto=" + valorBruto + ", impostos=" + impostos + ", dataDaEmissao=" + dataDaEmissao
				+ ", items=" + items + "]";
	}
	
}
