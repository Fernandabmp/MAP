package br.padrao.templateMethod;

public class CapitalTemplateTermLoan extends CapitalTemplate{

	public double capital(Loan loan) {
		return(loan.getCommitment() * duration(loan) * riskFactorFor(loan));				
	}
}
