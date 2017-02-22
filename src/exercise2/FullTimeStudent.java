package exercise2;

public class FullTimeStudent extends Student {

	private final int tuition = 2000; //Constant value for tuition
	
	
	public FullTimeStudent(String name, boolean status) { //Constructor
		super(name, status); //Super class constructor
	}

	//Overridden method calculateTuition
	
	@Override
	public double calculateTuition() {
		
		return this.tuition;
	}
	
	//Overridden method displayStudentInfo that returns a formatted string

	@Override
	public String displayStudentInfo() {

		return String.format("%s: %s%n%s: %s%n%s: %.2f%n", "Student's Name", super.getName(),
				"Full Time Student", super.isStatus(),"Tuition Calculated", calculateTuition());
		
	}

}
