package br.padrao.templateMethod;

public abstract class CapitalTemplate {
	

	protected double riskFactorFor(Loan loan) {
		return 0;
	}

	public double duration(Loan loan) {
		return 0;
	}
	
	public double capital(Loan loan){
		return 0;
	}
	
	public double capitalTemplate(Loan loan){
        return(duration(loan) * riskFactorFor(loan) * capital(loan));
    }
	
}	