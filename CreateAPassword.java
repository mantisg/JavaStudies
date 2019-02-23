import java.util.Scanner;
import javax.swing.JOptionPane;

public class CreateAPassword
{

   public static void main (String[] args)
   {
   
      //Variables used
   
      String firstName;
      String lastName;
      String fullNmLength;
      char firstInit;
      char lastInit;
      int firstLength;
      int lastLength;
      int filler;
      
      //Get first name
      firstName = JOptionPane.showInputDialog("Please enter your first name: ");
      //Get last name
      lastName = JOptionPane.showInputDialog("Please enter your last name: ");
      //Calculate password value
      firstName = firstName.toLowerCase();
      lastName = lastName.toLowerCase();
      
      firstInit = firstName.charAt(0);
      lastInit = lastName.charAt(1);
      
      firstLength = firstName.length();
      lastLength = lastName.length();
      
      filler = firstLength * lastLength;
      fullNmLength = Integer.toString(filler);
      
      JOptionPane.showMessageDialog(null, "Your new password is: " + firstInit + lastInit + fullNmLength);
      
      
      
      System.exit(0);
   
   }

}
