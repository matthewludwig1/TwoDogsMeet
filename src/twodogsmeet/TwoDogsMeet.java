/*
    Matt Ludwig
    27 March 2019
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
        String dgNm1 = JOptionPane.showInputDialog("Two Dogs Meet! \n"+"Enter the name"
        + " of the first dog: ");
        String dgBreed1 = JOptionPane.showInputDialog("What is the first dog's breed: ");
         
        Dog dog1 = new Dog(dgNm1,dgBreed1); // constructs a new dog
        JOptionPane.showMessageDialog(null, "Name: " + dog1.getDogName()+ "\n" + "Breed: "
        + dog1.getDogBreed());
        
    }
    
}
