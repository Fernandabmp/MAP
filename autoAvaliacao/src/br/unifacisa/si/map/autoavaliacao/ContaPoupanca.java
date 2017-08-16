package br.unifacisa.si.map.autoavaliacao;

public class ContaPoupanca extends ContaBancaria{

	private double rendimento;
	
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public ContaPoupanca(String cpf) {
		super(cpf);
	}
	
}
