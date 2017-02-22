package exercise1;

public class Life extends Insurance {

	private final double lifeRate = 0.30; // lifeRate Constant
	private final double extraCharges = 130.20; // extraCharges Constant

	public Life(String typeOfInsurance, double monthlyCost) { // Constructor
		super(typeOfInsurance, monthlyCost); // Super class constructor

		// Adjusting the monthlyCost with lifeRate and extraCharges constants
		this.monthlyCost = this.monthlyCost + (this.monthlyCost * this.lifeRate) + this.extraCharges;

	}

	// Getters
	
	public double getLifeRate() {
		return lifeRate;
	}

	public double getExtraCharges() {
		return extraCharges;
	}

	//Overridden method setInsuranceMethod
	
	@Override
	public void setInsuranceCost(double newCost) {

		if (newCost <= 0.0)
			throw new IllegalArgumentException("Monthly Cost must be greater than 0.0");

		this.monthlyCost = newCost + (newCost * getLifeRate()) + getExtraCharges();

	}

	//Overridden method displayInfo that returns a formatted string
	
	@Override
	public String displayInfo() {

		return String.format("%s: %s%n%n%s: %.2f%n%s: %s%n%s: %s", "Insurance Type", super.getTypeOfInsurance(),
				"Monthly Cost", super.getMonthlyCost(), "Life Insurance Rate ", getLifeRate(), "Extra charges ",
				getExtraCharges());

	}

}
