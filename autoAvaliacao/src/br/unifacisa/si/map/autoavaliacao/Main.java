package br.unifacisa.si.map.autoavaliacao;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("094.557.524-06");
		
		conta.depositar(100);
		System.out.println(conta.getSaldo());	
		
	}

}
