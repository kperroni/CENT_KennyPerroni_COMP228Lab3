package exercise2;

public abstract class Student {

	private final String name; //Name for the student
	private boolean status; //Status that will determine if a student is full-time or part-time
	
	public Student(String name, boolean status){ //Constructor
		
		this.name = name; //Assigning values
		this.status = status; //Assigning values
	}
	
	
	//Getters
	
	public String getName() {
		return name;
	}



	public boolean isStatus() {
		return status;
	}


	//Abstract methods
	
	public abstract double calculateTuition();
	public abstract String displayStudentInfo();
	
}
