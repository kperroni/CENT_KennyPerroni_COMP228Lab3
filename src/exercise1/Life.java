package exercise1;

public class Life extends Insurance {

	private final double lifeRate = 0.30;
	private final double extraCharges = 130.20;
	
	public Life(String typeOfInsurance, double monthlyCost) {
		super(typeOfInsurance, monthlyCost);
		this.monthlyCost = this.monthlyCost + (this.monthlyCost * this.lifeRate) + this.extraCharges;
		
	}

	@Override
	public void setInsuranceCost(double newCost) {
		
		this.monthlyCost = newCost + (newCost * this.lifeRate) + this.extraCharges;

	}

	@Override
	public String displayInfo() {
		
		return String.format("%s: %s%n %s:%.2f", "Insurance Type", super.getTypeOfInsurance(), "Monthly Cost", super.getMonthlyCost());

	}

}
