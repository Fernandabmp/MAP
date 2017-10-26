package br.padrao.templateMethod;

public class Loan {
	
	private double commitment;
    private double outstandingRiskAmount;
    private double unusedRiskAmount;
    private double unusedPercentage;
   

    public double getCommitment() {
        return commitment;
    }

    public double getoutstandingRiskAmount() {
        return outstandingRiskAmount;
    }	

	public double unusedRiskAmount() {
		return unusedRiskAmount ;
	}
	
	public double getunusedPercentage(){
		return unusedPercentage;
	}
}
