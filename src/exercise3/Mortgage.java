package exercise3;

public abstract class Mortgage implements MortgageConstants {

	private int mortgageNumber;
	private String customerName;
	private double mortgageAmount;
	private double interestRate;
	private int term; // One year loan

	public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term) {

		this.mortgageAmount = mortgageAmount;
		this.customerName = customerName;
		this.mortgageAmount = mortgageAmount;
		this.interestRate = interestRate;

		switch (term) {

		case 1:
			term = MortgageConstants.shortTerm;
			break;
			
		case 2:	
			term = MortgageConstants.midTerm;
			break;
		
		case 3:
			term = MortgageConstants.longTerm;
			 break;
		
		default:
			term = MortgageConstants.shortTerm;
			break;
		}
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public abstract String getMortgageInfo();

}
