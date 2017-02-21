package exercise2;

public class PartTimeStudent extends Student {

	private int creditHours;
	private final int creditForHourPrice = 100;
	
	public PartTimeStudent(String name, boolean status, int creditHours) {
		super(name, status);		
		this.creditHours = creditHours;
	}
	
	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public double getCreditForHourPrice() {
		return creditForHourPrice;
	}

	@Override
	public double calculateTuition() {
		
		return this.getCreditHours() * getCreditForHourPrice();
	}

	@Override
	public String displayStudentInfo() {

		return String.format("%s: %s%n%s: %s%n%s: %.2f%n", "Student's Name", super.getName(),
				"Full Time Student", super.isStatus(),"Tuition Calculated", calculateTuition());
		
	}

}
