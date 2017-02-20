package exercise1;

public abstract class Insurance {

	private final String typeOfInsurance;
	protected double monthlyCost = 0.0;
	
	public Insurance(String typeOfInsurance, double monthlyCost){
		
		this.typeOfInsurance = typeOfInsurance;
		this.monthlyCost = monthlyCost;
		
	}

	public double getMonthlyCost() {
		return monthlyCost;
	}
	
	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}
	
	public abstract void setInsuranceCost(double newCost);
	public abstract String displayInfo();
	
	
	
}
