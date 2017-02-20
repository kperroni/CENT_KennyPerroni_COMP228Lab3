package exercise1;

public class Health extends Insurance {

	private final double healthRate = 0.20;
	
	public Health(String typeOfInsurance, double monthlyCost) {
		super(typeOfInsurance, monthlyCost);
		this.monthlyCost = this.monthlyCost + (this.monthlyCost * this.healthRate);
		
	}
	

	public double getHealthRate() {
		return healthRate;
	}


	@Override
	public void setInsuranceCost(double newCost) {
	    
		if(monthlyCost < 0.0)
			throw new IllegalArgumentException("Monthly Cost must be greater than 0.0");
		
	 	this.monthlyCost = (newCost) + (newCost * this.healthRate);

	}

	@Override
	public String displayInfo() {
		
		return String.format("%s: %s%n%n%s: %.2f%n%s: %s", "Insurance Type", super.getTypeOfInsurance(), "Monthly Cost", super.getMonthlyCost()
				, "Health Insurance Rate: ", getHealthRate());

	}

}
