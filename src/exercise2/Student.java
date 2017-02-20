package exercise2;

public abstract class Student {

	private final String name;
	private boolean status;
	
	public Student(String name, boolean status){
		
		this.name = name;
		this.status = status;
	}
	
	
	
	public String getName() {
		return name;
	}



	public boolean isStatus() {
		return status;
	}



	public abstract double calculateTuition();
	public abstract String displayStudentInfo();
	
}
