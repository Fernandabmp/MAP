package br.heranca.questao2;

public class Carro extends Veiculo{

	private int numPortas;
	private String placa;
	
	public Carro(String modelo, int numLugares, int comprimento, int ano, String cor, int numPortas, String placa) {
		super(modelo, numLugares, comprimento, ano, cor);
		this.numPortas = numPortas;
		this.placa = placa;		
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
	
}
