package exercise2;

public class FullTimeStudent extends Student {

	private final double tuition = 2000;
	
	
	public FullTimeStudent(String name, boolean status) {
		super(name, status);
	}

	@Override
	public double calculateTuition() {
		
		return this.tuition;
	}

	@Override
	public String displayStudentInfo() {

		return String.format("%s: %s%n%s: %s%n%s: %.2f%n", "Student's Name", super.getName(),
				"Full Time Student", super.isStatus(),"Tuition Calculated", calculateTuition());
		
	}

}
