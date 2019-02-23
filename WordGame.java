import javax.swing.JOptionPane;

public class WordGame
{

   public static void main (String[] args)
   {
   
      //Variables
      String name;
      String city;
      String college;
      String profession;
      String petName;
      String anType;
      String age;
      
      //Gathering info
      name       = JOptionPane.showInputDialog("Please enter your first name: ");
      age        = JOptionPane.showInputDialog("Please enter your age: ");
      city       = JOptionPane.showInputDialog("Please enter the name of a city: ");
      college    = JOptionPane.showInputDialog("Please enter the name of a college: ");
      profession = JOptionPane.showInputDialog("Please enter a profession: ");
      anType     = JOptionPane.showInputDialog("Please enter a type of animal: ");
      petName    = JOptionPane.showInputDialog("Please enter your pet's name: ");
      
      //Display story
      JOptionPane.showMessageDialog(null, "There once was a person named " + name + " who lived in " +
                                    city + ". At the age of " + age + ", " + name + " went to college at " +
                                    college + ". " + name + " graduated and went to work as a " + profession +
                                    ". Then, " + name + " adopted a(n) " + anType + " named " + petName + ". " +
                                    "They both lived happily ever after.");
      System.exit(0);
   
   }

}