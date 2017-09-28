package br.composicao.questao2;

public class Carro {

	private int numPortas;
	private String placa;
	private Veiculo veiculo;
	
	public Carro(String modelo, int numLugares, int comprimento, int ano, String cor, int numPortas, String placa){
		this.numPortas = numPortas;
		this.placa = placa;
		this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);	
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}	
	
}
