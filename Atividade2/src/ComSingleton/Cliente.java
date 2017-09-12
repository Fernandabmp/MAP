package ComSingleton;

public class Cliente {

	public static void main(String[] args) {

		LojaDeRoupas loja1 = LojaDeRoupas.getInstancia();
		System.out.println(loja1.venderCalcas());
		System.out.println(loja1.venderShort());
		System.out.println(loja1.venderCamisa());

		System.out.println("Estoque na loja 2 " + "\n" + loja1.exibirEstoque());

		LojaDeRoupas loja2 = LojaDeRoupas.getInstancia();
		System.out.println("Estoque na loja 2 " + "\n" + loja2.exibirEstoque());

	}
}
