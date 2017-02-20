package exercise1;

import javax.swing.JOptionPane;

public class InsuranceDriver {

	public static void main(String[] args) {

		Insurance[] insuranceArray = new Insurance[3];
		int control = 0;

		JOptionPane.showMessageDialog(null,
				"Here you are going to create " + insuranceArray.length + " objects of type Insurance!", "Welcome!", 1);
		JOptionPane.showMessageDialog(null,
				"Be advised that each object has additional charges when you set the monthly fee!", "Important", 2);

		while (control < insuranceArray.length) {

			try {
				String typeOfInsurance = JOptionPane.showInputDialog("Enter the type of the insurance: Health or Life");
				double monthlyCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the Monthly Cost"));
				if (typeOfInsurance.toLowerCase().equals("health")) {
					Health healthInsurance = new Health(typeOfInsurance, monthlyCost);
					insuranceArray[control] = healthInsurance;
					control++;
				} else {

					if (typeOfInsurance.toLowerCase().equals("life")) {
						Life lifeInsurance = new Life(typeOfInsurance, monthlyCost);
						insuranceArray[control] = lifeInsurance;
						control++;
					}

					else
						JOptionPane.showMessageDialog(null, "Type of insurance unknown by the system! Try again");
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You must enter a valid number!", "Error", 0);
			}

		}

		JOptionPane.showMessageDialog(null,
				"Objects successfully created! Now, you will set a new monthly cost for each object! And it will be displayed in a polymorphic way",
				"Information", 1);

		for (int i = 0; i < insuranceArray.length;) {

			try {
				double newCost = Double.parseDouble(
						JOptionPane.showInputDialog("Enter the new Monthly Cost for insurance "+(i+1)+" of type: "
								+ insuranceArray[i].getTypeOfInsurance().toUpperCase()));
				insuranceArray[i].setInsuranceCost(newCost);
				JOptionPane.showMessageDialog(null, "Monthly Cost successfully changed!", "Information", 1);
				JOptionPane.showMessageDialog(null, insuranceArray[i].displayInfo(), "Display Information", 1);
				i++;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You must enter a valid number for the new cost!", "Error", 0);
			}
		}

	}

}
