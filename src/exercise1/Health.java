package exercise1;

public class Health extends Insurance {

	private final double healthRate = 0.20; // healhRate constant

	public Health(String typeOfInsurance, double monthlyCost) {

		super(typeOfInsurance, monthlyCost); // Super class constructor
		
		// Adjusting the monthlyCost with healthRate constant
		this.monthlyCost = this.monthlyCost + (this.monthlyCost * this.healthRate); 
																				
	}

	// Getters
	
	public double getHealthRate() {
		return healthRate;
	}

	//Overridden method setInsuranceMethod
	
	@Override
	public void setInsuranceCost(double newCost) {

		if (newCost <= 0.0)
			throw new IllegalArgumentException("Monthly Cost must be greater than 0.0");

		this.monthlyCost = (newCost) + (newCost * this.healthRate); //Modifying protected variable monthlyCost

	}

	//Overridden method displayInfo that returns a formatted string
	
	@Override
	public String displayInfo() {

		return String.format("%s: %s%n%n%s: %.2f%n%s: %s", "Insurance Type", super.getTypeOfInsurance(), "Monthly Cost",
				super.getMonthlyCost(), "Health Insurance Rate ", getHealthRate());

	}

}
