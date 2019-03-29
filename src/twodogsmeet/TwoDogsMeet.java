/*
    Matt Ludwig
    28 March 2019
 */

package twodogsmeet;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // first dog
        String dgNm1 = JOptionPane.showInputDialog("Two Dogs Meet! \n"+"Enter the name"
        + " of the first dog: ");
        String dgBreed1 = JOptionPane.showInputDialog("What is the breed of the first dog? ");
        if (dgNm1.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Please enter your Dog's name");
           dgNm1 = JOptionPane.showInputDialog("Two Dogs Meet! \n"+"Enter the name"
        + " of the first dog: ");
        }
        if (dgBreed1.isEmpty()) {
          dgBreed1 = JOptionPane.showInputDialog("Please enter the breed of the first dog: ");
        }
        Dog dog1 = new Dog(dgNm1,dgBreed1); // constructs a new dog
        JOptionPane.showMessageDialog(null, "Name: " + dog1.getDogName()+ "\n" + "Breed: "
        + dog1.getDogBreed()+"\n"+ "Age: "+ dog1.getDogAge() +"\nAggression: " + dog1.getAggression() + "\nHunger: "  
        + dog1.getHunger());
        
        // second dog
        String dgnm2 = JOptionPane.showInputDialog("Enter the name of the second dog: ");
        String dgBreed2 = JOptionPane.showInputDialog("What is the breed of the second dog?");
        if (dgnm2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your Dog's name");
            dgnm2 = JOptionPane.showInputDialog("Enter the name of the second dog: ");
        }
        if (dgBreed2.isEmpty()) {
           dgBreed2 = JOptionPane.showInputDialog("Please enter the breed of the second dog: ");
        }
        Dog dog2 = new Dog(dgnm2, dgBreed2);
        JOptionPane.showMessageDialog(null, "Name: "+ dog2.getDogName() + "\n" + "Breed: " + dog2.getDogBreed()
        + "\n" +"Age: "+ dog2.getDogAge()+ "\n" +"Agression: " + dog2.getAggression() + "\n" + "Hunger: " + 
                dog2.getHunger());
        
        // prompts user to choose aggression value
        int aggChoice1 = Integer.parseInt(JOptionPane.showInputDialog("Would you like to change the "
                + "aggression of the first dog?" + "\n"+ "Press 1 to change the aggression. Press 2 to "
                + "continue: "));
        if (aggChoice1 == 1) { 
            dog1.setAggression(Integer.parseInt(JOptionPane.showInputDialog("On a scale of 1 - 10, how "
                    + "aggressive is " + dog1.getDogName()+ "?")));
        }
        else {  // continue on
            int aggChoice2 = Integer.parseInt(JOptionPane.showInputDialog("Would you like to change the "
                    + "aggression of the second dog?"+ "\n" + "Press 1 to change the aggression. Press 2 to "
                    + "continue: "));
            if (aggChoice2 == 1) {
                dog2.setAggression(Integer.parseInt(JOptionPane.showInputDialog("On a scale of 1 - 10, how "
                        + "aggressive is "+ dog2.getDogName() + "?")));
            }
            else { // proceeds to the dog meeting
                
                if (dog1.getAggression() >= dog2.getAggression()) { 
                    
                    if (dog1.getHunger() >= dog2.getHunger()) {
                        JOptionPane.showMessageDialog(null, dog1.getDogName() + " stole " + dog2.getDogName()+ "'s "
                        + "food.");
                    }
                    
                    
                    else {
                        JOptionPane.showMessageDialog(null, dog1.getDogName() + " chased "+ dog2.getDogName()+ 
                                ", and " + dog2.getDogName() + " nervously ran away.");
                    }
         
                }
                else if (dog2.getAggression() == 10 && dog1.getAggression() < 7) {
                    JOptionPane.showMessageDialog(null, dog2.getDogName() + " chased " + dog1.getDogName());
                }
                
                
            }
        }
        
        
        
    }
    
}
