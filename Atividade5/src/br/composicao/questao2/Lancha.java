package br.composicao.questao2;

public class Lancha {

	private int numMotores;
	private Veiculo veiculo;
	
	public Lancha(String modelo, int numLugares, int comprimento, int ano, String cor, Veiculo veiculo, int numMotores){
		this.numMotores = numMotores;
		this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
		
	}
	
	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}