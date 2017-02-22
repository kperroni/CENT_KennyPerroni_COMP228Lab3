package exercise1;

public abstract class Insurance {

	private final String typeOfInsurance; //Contains the type of insurance
	protected double monthlyCost = 0.0; //Protected variable so its children have access to it
	
	public Insurance(String typeOfInsurance, double monthlyCost){ //Constructor
		
		if(monthlyCost <= 0.0) //Validation for monthly cost
			throw new IllegalArgumentException("Monthly Cost must be greater than 0.0");
			
		//Assigning values
		
	    this.typeOfInsurance = typeOfInsurance;
		this.monthlyCost = monthlyCost;
		
	}

	//Getters
	
	public double getMonthlyCost() {
		return monthlyCost;
	}
	
	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}
	
	//Abstract methods
	
	public abstract void setInsuranceCost(double newCost);
	public abstract String displayInfo();
	
	
	
}
