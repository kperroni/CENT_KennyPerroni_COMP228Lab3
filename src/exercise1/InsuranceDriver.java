package exercise1;

import javax.swing.JOptionPane;

public class InsuranceDriver {

	public static void main(String[] args) {
		
		boolean createObjects = true;
		Insurance[] insuranceArray = new Insurance[2]; 
		int control = 0;
		
		JOptionPane.showMessageDialog(null, "Welcome! Here you are going to create objects of type Insurance!");
		
		while(createObjects){
						
			String typeOfInsurance = JOptionPane.showInputDialog("Enter the type of the insurance");
			double monthlyCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the Monthly Cost"));
			
			if(typeOfInsurance.toLowerCase().equals("health")) {				
				 Health healthInsurance  = new Health(typeOfInsurance, monthlyCost);
				 insuranceArray[control] = healthInsurance;
			}
			else{
				
				if(typeOfInsurance.toLowerCase().equals("life")){
				Life lifeInsurance = new Life(typeOfInsurance, monthlyCost);
				insuranceArray[control] = lifeInsurance;
				}
			}		
		
			control++;
			
			createObjects = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter true if you want to keep creating objects. Otherwise, enter false"));
		}
		
		
		for(Insurance insuranceItem : insuranceArray){
			
			double newCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the new Monthly Cost for the insurance of type: "+ insuranceItem.getTypeOfInsurance()));
			insuranceItem.setInsuranceCost(newCost);
			JOptionPane.showMessageDialog(null, "Monthly Cost successfully changed!");
			JOptionPane.showMessageDialog(null, insuranceItem.displayInfo());
		}

	}

}
