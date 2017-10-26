package br.padrao.templateMethod;

public class CapitalTemplateAdvisedLine extends CapitalTemplate{

	public double capital(Loan loan) { 
		return(loan.getCommitment() * loan.getunusedPercentage() * duration(loan) * riskFactorFor(loan));
	}	
}
