package exercise3;

public class PersonalMortgage extends Mortgage {

	private final double personalInterestRate = 0.02; //Personal interest rate constant
	
	public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate,
			int term) { //Constructor
		super(mortgageNumber, customerName, mortgageAmount, interestRate, term); //Super class constructor
		this.setInterestPersonal(); //Setting the proper interest rate for personal mortgage
	}

	//Getters and Setters
	
	public double getPersonalInterestRate() {
		return personalInterestRate;
	}
	
	public void setInterestPersonal(){
		super.setInterestRate(super.getInterestRate() + this.getPersonalInterestRate());
	}

	
	//Overridden method getMortgageInfo that returns a formatted string
	
	@Override
	public String getMortgageInfo() {
		
		return String.format("%s: %s%n%s: %d%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %s(%d %s)%n%n%s: %.2f", 
				"Bank Name", MortgageConstants.bankName, "Mortgage number", super.getMortgageNumber(), 
				"Mortgage Type", "Personal Mortgage", "Customer's name", super.getCustomerName(),
				"Mortgage Amount", getMortgageAmount(), "Interest Rate", super.getInterestRate(),
				"Term", super.getTermName(), super.getTerm(), "years", "Total amount owed", super.getMortgageAmount() * (1+super.getInterestRate()));
		
	}	

}
