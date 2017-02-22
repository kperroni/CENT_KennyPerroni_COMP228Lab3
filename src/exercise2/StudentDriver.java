package exercise2;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {

		int numberOfStudents = 0; //How many students will be processed
		String aux = ""; //Variable that will help in validations
		Scanner myScanner = new Scanner(System.in); //Scanner object for inputs
		
		while (numberOfStudents < 1) { //Loop that will execute until number of students is at least 1
			
			try {
				//Try and catch blocks are used for validations
				
				System.out.println("Enter the number of students you want to create:\n");
				aux = myScanner.next(); //Getting value
				numberOfStudents = Integer.parseInt(aux); //Parsing value
				
				if (numberOfStudents < 1) //Validation if number of students is lesser than 1
					System.out.println("You must at least create 1 student!\n");
				
			} catch (Exception e) {
				System.out.println("Enter a valid number!\n");				
			}
		}

		Student[] studentArray = new Student[numberOfStudents]; //Creating an array of size numberOfStudents variable

		for (int i = 0; i < studentArray.length;) { //Looping through array

			try {
				//Try and catch blocks are used for validations
				System.out.println("Enter 1 to create a Full Time Student\nEnter 2 to create a Part Time Student\n");
				aux = myScanner.next(); //Getting value
				int option = Integer.parseInt(aux); //Parsing value
				System.out.println();

				if (option != 1 && option != 2) //Validation of options
					System.out.println("You must enter option 1 or option 2!\n");

				else {

					System.out.println("Enter student's name\n");
					String name = myScanner.next(); //Getting value
					System.out.println();
					
					if (option == 1) {
						FullTimeStudent newStudent = new FullTimeStudent(name, true); //Creating full time student
						studentArray[i] = newStudent; //Populating array
						i++;
					}

					if (option == 2) {
						
						try {
							
							System.out.println("Enter student's credit hours\n");
							aux = myScanner.next(); //Getting value
							int creditHours = Integer.parseInt(aux); //Parsing value
							
							try{
								
							
							PartTimeStudent newStudent = new PartTimeStudent(name, false, creditHours); //Creating part-time Student
							studentArray[i] = newStudent; //Populating array
							i++;
							
							} catch(IllegalArgumentException e){
								System.out.println(e.getMessage());
							}
							
						} catch (Exception e) {
							System.out.println("You must enter a valid value for credit hours!\n");
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Invalid option!\n");
			}

		}
		
		//Looping through array to display information
		
		for(Student studentItem : studentArray){
			
			System.out.println(studentItem.displayStudentInfo());
		}
		myScanner.close();
	}

}
