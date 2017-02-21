package exercise3;

public class BusinessMortgage extends Mortgage {

	private final double businessInterestRate = 0.01;
	
	public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate,
			int term) {
		super(mortgageNumber, customerName, mortgageAmount, interestRate, term);
		super.setInterestRate(businessInterestRate);	
		// TODO Auto-generated constructor stub
	}

	public double getBusinessInterestRate() {
		return businessInterestRate;
	}
	
	@Override
	public String getMortgageInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setInterestBusiness(){
		super.setInterestRate(super.getInterestRate() + this.getBusinessInterestRate());
	}


}
