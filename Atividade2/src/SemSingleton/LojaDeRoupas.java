package SemSingleton;

public class LojaDeRoupas {

	public int totalCamisa = 10;
	public int totalShort = 10;
	public int totalCalcas = 10;

	public String venderCalcas() {
		totalCalcas--;
		return new String("1 Calça vendida");
	}

	public String venderShort() {
		totalShort--;
		return new String("1 Short vendido");
	}

	public String venderCamisa() {
		totalCamisa--;
		return new String("1 Camisa vendida.");
	}
	
	public String exibirEstoque() {
		return new String("Total de Camisa em estoque: " + totalCamisa + "\nTotal de Short em estoque: "
				+ totalShort + "\nTotal de Calças em estoque: " + totalCalcas);
	}
}
