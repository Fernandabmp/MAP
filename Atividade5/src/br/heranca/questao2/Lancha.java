package br.heranca.questao2;

public class Lancha extends Veiculo {

	private int numMotores;
	
	public Lancha(String modelo, int numLugares, int comprimento, int ano, String cor, int numMotores) {
		super(modelo, numLugares, comprimento, ano, cor);
		this.numMotores = numMotores;
	}
	
	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

}
