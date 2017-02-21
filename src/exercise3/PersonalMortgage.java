package exercise3;

public class PersonalMortgage extends Mortgage {

	private final double personalInterestRate = 0.02;
	
	public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate,
			int term) {
		super(mortgageNumber, customerName, mortgageAmount, interestRate, term);
		super.setInterestRate(personalInterestRate);
	}

	public double getPersonalInterestRate() {
		return personalInterestRate;
	}
	
	@Override
	public String getMortgageInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setInterestBusiness(){
		super.setInterestRate(super.getInterestRate() + this.getPersonalInterestRate());
	}

	

}
