package exercise1;

public class Life extends Insurance {

	private final double lifeRate = 0.30;
	private final double extraCharges = 130.20;
	
	public Life(String typeOfInsurance, double monthlyCost) {
		super(typeOfInsurance, monthlyCost);
		this.monthlyCost = this.monthlyCost + (this.monthlyCost * this.lifeRate) + this.extraCharges;
		
	}
	
	

	public double getLifeRate() {
		return lifeRate;
	}



	public double getExtraCharges() {
		return extraCharges;
	}



	@Override
	public void setInsuranceCost(double newCost) {
		
		if(monthlyCost < 0.0)
			throw new IllegalArgumentException("Monthly Cost must be greater than 0.0");
		
		this.monthlyCost = newCost + (newCost * getLifeRate()) + getExtraCharges();

	}

	@Override
	public String displayInfo() {
		
		return String.format("%s: %s%n%n%s: %.2f%n%s: %s%n%s: %s", "Insurance Type", super.getTypeOfInsurance(), "Monthly Cost", super.getMonthlyCost()
				, "Life Insurance Rate: ", getLifeRate(), "Extra charges: ", getExtraCharges());

	}

}
