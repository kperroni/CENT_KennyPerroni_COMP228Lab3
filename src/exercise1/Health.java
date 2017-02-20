package exercise1;

public class Health extends Insurance {

	private final double healthRate = 0.20;
	
	public Health(String typeOfInsurance, double monthlyCost) {
		super(typeOfInsurance, monthlyCost);
		this.monthlyCost = this.monthlyCost + (this.monthlyCost * this.healthRate);
		
	}

	@Override
	public void setInsuranceCost(double newCost) {
	    
	 	this.monthlyCost = (newCost) + (newCost * this.healthRate);

	}

	@Override
	public String displayInfo() {
		
		return String.format("%s: %s%n %s:%.2f", "Insurance Type", super.getTypeOfInsurance(), "Monthly Cost", super.getMonthlyCost());

	}

}
