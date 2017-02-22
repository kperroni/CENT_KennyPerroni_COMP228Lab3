package exercise2;

public class PartTimeStudent extends Student {

	private int creditHours; //Variable to store creditHours
	private final int creditForHourPrice = 100; //Constant that contains the credits for hour price
	
	public PartTimeStudent(String name, boolean status, int creditHours) { //Constructor
		super(name, status); //Super class constructor
		
		if(creditHours < 1) //Validating creditHours
			throw new IllegalArgumentException("Credit hours must be greater than 0\n");	
		
		this.creditHours = creditHours; //Assigning value to instance variable
	}
	
	//Getter and Setters
	
	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public double getCreditForHourPrice() {
		return creditForHourPrice;
	}

	//Overridden method calculateTuition
	
	@Override
	public double calculateTuition() {
		
		return this.getCreditHours() * getCreditForHourPrice();
	}
	
	//Overridden method displayStudentInfo that returns a formatted string

	@Override
	public String displayStudentInfo() {

		return String.format("%s: %s%n%s: %s%n%s: %.2f%n", "Student's Name", super.getName(),
				"Full Time Student", super.isStatus(),"Tuition Calculated", calculateTuition());
		
	}

}
