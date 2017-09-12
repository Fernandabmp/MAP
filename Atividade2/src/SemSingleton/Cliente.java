package SemSingleton;

public class Cliente {
	
	public static void main(String[] args) {
		LojaDeRoupas loja1 = new LojaDeRoupas();
	    System.out.println(loja1.venderCalcas());
	    System.out.println(loja1.venderShort());
	    System.out.println(loja1.venderCamisa());
	 
	    System.out.println("Estoque na loja 2 "  + "\n" +  loja1.exibirEstoque());
	    	    
		LojaDeRoupas loja2 = new LojaDeRoupas();	 
	    System.out.println("Estoque na loja 2 " + "\n" + loja2.exibirEstoque());
	    
	}

}
