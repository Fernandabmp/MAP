package br.unifacisa.si.map.autoavaliacao;


public class ContaCorrente extends ContaBancaria {

	private double chequeEspecial;
	
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}


	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}


	public ContaCorrente(String cpf) {
		super(cpf);
		
	}

}
