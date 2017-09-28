package br.composicao.questao2;

public class Aviao {

	private String prefixo;
	private int numTurbinas;
	private Veiculo veiculo;
	
	public Aviao(String modelo, int numLugares, int comprimento, int ano, String cor, int numTurbinas, String prefixo){
		this.prefixo = prefixo;
		this.numTurbinas = numTurbinas;
		this.veiculo = new Veiculo(modelo, numLugares, comprimento, ano, cor);
		
	}
	
	public String getPrefixo() {
		return prefixo;
	}
	
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	
	public int getNumTurbinas() {
		return numTurbinas;
	}
	
	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
