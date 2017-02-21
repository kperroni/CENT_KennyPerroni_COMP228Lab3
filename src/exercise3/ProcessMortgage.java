package exercise3;

import javax.swing.JOptionPane;

public class ProcessMortgage {

	public static void main(String[] args) {
	
		Mortgage[] myMortgages = new Mortgage[3];
		
		JOptionPane.showMessageDialog(null, "Here you are going to create 3 Mortgages!", "Welcome!", 1);
		
		try{
			
		double currentRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the current interest rate"));
		
		for (int i = 0; i < myMortgages.length;) {
			
			try{
			int mortgageType = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 to create a Business Mortgage\nEnter 2 to create a Personal Mortgage"));
			
			if(mortgageType != 1 && mortgageType != 2)
				JOptionPane.showMessageDialog(null, "You must enter option 1 or option 2", "Error", 0);
			
			else{
				
				int mortgageNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the mortgage number"));
				String customerName = JOptionPane.showInputDialog("Enter customer's name");
				double mortgageAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the mortgage amount"));
				int term =  Integer.parseInt(JOptionPane.showInputDialog("Enter the mortgage term"));
				
				if(mortgageType == 1){					
					BusinessMortgage newBusisnessMortgage = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, currentRate, term);
					myMortgages[i] = newBusisnessMortgage;
					i++;
				}
				
				if(mortgageType == 2){					
					PersonalMortgage newPersonalMortgage = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, currentRate, term);
					myMortgages[i] = newPersonalMortgage;
					i++;
				}				
				
			}
			
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Invalid option", "Error", 0);
			}
	
		}
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "You must enter a valid interest rate!", "Error", 0);
		}
		
		for(Mortgage mortgageItem : myMortgages){
			
			mortgageItem.getMortgageInfo();
		}
	}

}
