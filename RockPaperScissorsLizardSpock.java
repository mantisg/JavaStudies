import java.util.Scanner;

public class RockPaperScissorsLizardSpock
{

     public static void main(String[] args)
     {
         
         String userInput;
         char userChar;
         final int OPTIONS = 5;
         
         int computer, player;
         Scanner keyboard = new Scanner(System.in);
         int start = 0;
         
         while (start++ < 25)
         {
         computer = (int) (Math.random() * OPTIONS) + 1;
         
         System.out.print("Enter your choice:\nR for Rock\nP for " +
                          "Paper\nS for Scissors\nL for Lizard\nK for Spock: ");
                            
         userInput = keyboard.nextLine();
         userChar = userInput.charAt(0);
         System.out.print("The computer is ");
         
         switch (computer)
         {
         
            case 1:
             
               System.out.println("Rock");
               break;
            
            case 2:
             
               System.out.println("Paper");
               break;
            
            case 3: 
            
               System.out.println("Scissors");
               break;
               
            case 4: 
            
               System.out.println("Lizard");
               break;
               
            case 5: 
            
               System.out.println("Spock");
               break;
         
         }
         System.out.print("You are ");
         
         switch (userChar)
         {
         
            case 'r':
            case 'R':
            
               System.out.println("Rock");
               player = 1;
               break;
            
            case 'p':
            case 'P':
            
               System.out.println("Paper");
               player = 2;
               break;
            
            case 's':
            case 'S':
            
               System.out.println("Scissors");
               player = 3;
               break;
               
            case 'l':
            case 'L':
            
               System.out.println("Lizard");
               player = 4;
               break;
               
            case 'k':
            case 'K':
            
               System.out.println("Spock");
               player = 5;
               break;
            
            default:
            
               System.out.println("Not rock, paper, scissors, lizard or Spock");
               player = 6;
         
         }
         // Determine the winner
         if (computer == player)
            System.out.println("It's a tie\n\n");
         
         else
         {
         
            boolean lose = 
            
            (player == 1 && computer == 2) ||
            (player == 1 && computer == 5) ||
            (player == 2 && computer == 3) ||
            (player == 2 && computer == 4) ||
            (player == 3 && computer == 1) ||
            (player == 3 && computer == 5) ||
            (player == 4 && computer == 1) ||
            (player == 4 && computer == 3) ||
            (player == 5 && computer == 2) ||
            (player == 5 && computer == 4);
            
         
            if (lose)
               System.out.println("You lose\n\n");
               
            else
               System.out.println("YOU WIN!\n\n");
            
         }
         
         }
                           
    }
        
}