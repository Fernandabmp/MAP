package br.padrao.strategy;

public class Cliente {

	public static void main(String[] args) {
		
		Funcionario funcionarioDesenvolvedor = new Funcionario(GratificacaoEnum.DESENVOLVEDOR, 300, 1);
		System.out.println(funcionarioDesenvolvedor.calcularGratificacao());
		
		Funcionario funcionarioDBA = new Funcionario(GratificacaoEnum.DBA, 300, 1);
		System.out.println(funcionarioDBA.calcularGratificacao());
		
		Funcionario funcionarioLider = new Funcionario(GratificacaoEnum.LIDER, 500, 2);
		System.out.println(funcionarioLider.calcularGratificacao());	
		
		Funcionario funcionarioGerente = new Funcionario(GratificacaoEnum.GERENTE, 600, 2 );
		System.out.println(funcionarioGerente.calcularGratificacao());
	}
}
