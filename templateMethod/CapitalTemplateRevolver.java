package br.padrao.templateMethod;

public class CapitalTemplateRevolver extends CapitalTemplate {
	

	protected double unusedRiskFactor(Loan loan) {
		return 0;
	}

	public double capital(Loan loan) {
        return (loan.getoutstandingRiskAmount() * duration(loan) * riskFactorFor(loan) + 
        		loan.unusedRiskAmount() * duration(loan) * unusedRiskFactor(loan));	
	}	
}