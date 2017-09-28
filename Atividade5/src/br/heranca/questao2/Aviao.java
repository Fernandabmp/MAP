package br.heranca.questao2;

public class Aviao extends Veiculo{

	private String prefixo;
	private int numTurbinas;
	
	public Aviao(String modelo, int numLugares, int comprimento, int ano, String cor, String prefixo, int numTurbinas) {
		super(modelo, numLugares, comprimento, ano, cor);
		this.prefixo = prefixo;
		this.numTurbinas = numTurbinas;
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

}
