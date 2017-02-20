package exercise2;

import javax.swing.JOptionPane;

public class StudentDriver {

	public static void main(String[] args) {

		int numberOfStudents = 0;

		while (numberOfStudents < 1) {
			try {
				numberOfStudents = Integer
						.parseInt(JOptionPane.showInputDialog("Enter the number of students you want to create"));
				if (numberOfStudents < 1)
					JOptionPane.showMessageDialog(null, "You must at least create 1 student!", "Error", 0);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter a valid number!", "Error", 0);
			}
		}

		Student[] studentArray = new Student[numberOfStudents];

		for (int i = 0; i < studentArray.length;) {

			try {

				int option = Integer.parseInt(JOptionPane.showInputDialog(
						"Enter 1 to create a Full Time Student\nEnter 2 to create a Part Time Student"));

				if (option != 1 && option != 2)
					JOptionPane.showMessageDialog(null, "You must enter option 1 or option 2!", "Error", 0);

				else {

					String name = JOptionPane.showInputDialog("Enter student's name");

					if (option == 1) {
						FullTimeStudent newStudent = new FullTimeStudent(name, true);
						studentArray[i] = newStudent;
						i++;
					}

					if (option == 2) {
						try {
							int creditHours = Integer
									.parseInt(JOptionPane.showInputDialog("Enter student's credit hours"));
							PartTimeStudent newStudent = new PartTimeStudent(name, false, creditHours);
							studentArray[i] = newStudent;
							i++;
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null, "You must enter a valid value for credit hours!",
									"Error", 0);
						}
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Invalid option!", "Error", 0);
			}

		}
		
		for(Student studentItem : studentArray){
			
			System.out.println(studentItem.displayStudentInfo());
		}
	}

}
