import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      int sides;     // The number of sides for choice 7
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         
         printMenu();
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // Call the circleArea method and
               // store the result in the value variable
               
               value = circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // Call the rectangleArea method and
               // store the result in the value variable
               
               value = rectangleArea(length, width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // Call the triangleArea method and
               // store the result in the value variable
               
               value = triangleArea(base, height);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // Call the circumference method and
               // store the result in the value variable
               
               value = circleCircumference(radius);

               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // Call the perimeter method and
               // store the result in the value variable
               
               value = rectanglePerimeter(length, width);

               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // Call the perimeter method and
               // store the result in the value variable
               
               value = trianglePerimeter(side1, side2, side3);

               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
               
               case 7:
                  // Get number of sides in shape
                  System.out.println("Choose how many sides are in the shape \n" +
                                     "(the calculator will only handle up to 12 sides): ");
                  
                  sides = keyboard.nextInt();
                  
                  // Get the angle values for each shape
                  // Then calculate the missing angle
                  numberOfSides(sides);
                  
                  break;                   
                  
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // Create the printMenu method here
   public static void printMenu()
   {
   
      System.out.println("This is a Geometry Calculator.");
      System.out.println("Choose what you would like to calculate.");
      System.out.println("1. Find the area of a circle");
      System.out.println("2. Find the area of a rectangle");
      System.out.println("3. Find teh area of a triangle");
      System.out.println("4. Find the circumferance of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.println("7. Find missing angle value of a shape");
      System.out.print("Enter the number of your choice: ");
   
   }
   // Create the value-returning methods here
   
   /** This method calculates and returns the area of a circle.
       @param r for the radius */
   
   public static double circleArea(double r)
   {
   
      double areaCir = Math.PI * Math.pow(r, 2);
      return areaCir;
   
   }
   
   /** This method calculates and returns the area of a rectangle.
       @param l for the length of the longer sides
       @param w for the width of the shorter sides */
   
   public static double rectangleArea(double l, double w)
   {
   
      double areaRec = l * w;
      return areaRec;
   
   }
   
   /** This method calculates and returns the area of a triangle.
       @param b for the base length of the triangle
       @param h for the height of the triangle */
   
   public static double triangleArea(double b, double h)
   {
   
      double areaTri = (1.0/2) * b * h;
      return areaTri;
   
   }
   
   /** This method calculates and returns the circumference of a circle.
       @param r for the radius of the circle */
   
   public static double circleCircumference(double r)
   {
   
      double cirCircle = 2 * Math.PI * r;
      return cirCircle;
   
   }
   
   /** This method calculates and returns the perimeter of a rectangle.
       @param l for the length of the longer sides
       @param w for the width of the shorter sides */
   
   public static double rectanglePerimeter(double l, double w)
   {
   
      double recPer = (2 * l) + (2 * w);
      return recPer;
   
   }
   
   /** This method calculates and returns the perimeter of a triangle.
       @param s1 for the length of the first side
       @param s2 for the length of the second side
       @param s3 for the length of the third side */
   
   public static double trianglePerimeter(double s1, double s2, double s3)
   {
   
      double triPer = s1 + s2 + s3;
      return triPer;
   
   }
   
   public static void numberOfSides(int sides)
   {
   
      double value = 0.0;     // Returned by missingAngle method
      double angle1 = 0.0;    // The first angle of user's shape
      double angle2 = 0.0;    // The second angle of the user's shape
      double angle3 = 0.0;    // The third angle of the user's shape
      double angle4 = 0.0;    // The fourth angle of the user's shape
      double angle5 = 0.0;    // The fifth angle of the user's shape
      double angle6 = 0.0;    // The sixth angle of the user's shape
      double angle7 = 0.0;    // The seventh angle of the user's shape
      double angle8 = 0.0;    // The eighth angle of the user's shape
      double angle9 = 0.0;    // The ninth angle of the user's shape
      double angle10 = 0.0;   // The tenth angle of the user's shape
      double angle11 = 0.0;   // The final angle of the user's shape
      
      Scanner keyboard = new Scanner(System.in);
   
      switch (sides)
      {   
                  
          case 3: 
                     
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
                        
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);
             
             System.out.println("The missing angle in the shape is: " +
                                     value);             
             break;
                        
          case 4:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
                        
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
                        
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);             
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 5:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);             
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 6:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             System.out.println("Value of the fifth angle: ");
             angle5 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);             
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 7:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             System.out.println("Value of the fifth angle: ");
             angle5 = keyboard.nextDouble();
             
             System.out.println("Value of the sixth angle: ");
             angle6 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);             
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 8:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             System.out.println("Value of the fifth angle: ");
             angle5 = keyboard.nextDouble();
             
             System.out.println("Value of the sixth angle: ");
             angle6 = keyboard.nextDouble();
             
             System.out.println("Value of the seventh angle: ");
             angle7 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);             
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 9:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             System.out.println("Value of the fifth angle: ");
             angle5 = keyboard.nextDouble();
             
             System.out.println("Value of the sixth angle: ");
             angle6 = keyboard.nextDouble();
             
             System.out.println("Value of the seventh angle: ");
             angle7 = keyboard.nextDouble();
             
             System.out.println("Value of the eighth angle: ");
             angle8 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 10:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             System.out.println("Value of the fifth angle: ");
             angle5 = keyboard.nextDouble();
             
             System.out.println("Value of the sixth angle: ");
             angle6 = keyboard.nextDouble();
             
             System.out.println("Value of the seventh angle: ");
             angle7 = keyboard.nextDouble();
             
             System.out.println("Value of the eighth angle: ");
             angle8 = keyboard.nextDouble();
             
             System.out.println("Value of the ninth angle: ");
             angle9 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 11:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             System.out.println("Value of the fifth angle: ");
             angle5 = keyboard.nextDouble();
             
             System.out.println("Value of the sixth angle: ");
             angle6 = keyboard.nextDouble();
             
             System.out.println("Value of the seventh angle: ");
             angle7 = keyboard.nextDouble();
             
             System.out.println("Value of the eighth angle: ");
             angle8 = keyboard.nextDouble();
             
             System.out.println("Value of the ninth angle: ");
             angle9 = keyboard.nextDouble();
             
             System.out.println("Value of the tenth angle: ");
             angle10 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);             
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
          case 12:
          
             System.out.println("Value of the first angle: ");
             angle1 = keyboard.nextDouble();
             
             System.out.println("Value of the second angle: ");
             angle2 = keyboard.nextDouble();
             
             System.out.println("Value of the third angle: ");
             angle3 = keyboard.nextDouble();
             
             System.out.println("Value of the fourth angle: ");
             angle4 = keyboard.nextDouble();
             
             System.out.println("Value of the fifth angle: ");
             angle5 = keyboard.nextDouble();
             
             System.out.println("Value of the sixth angle: ");
             angle6 = keyboard.nextDouble();
             
             System.out.println("Value of the seventh angle: ");
             angle7 = keyboard.nextDouble();
             
             System.out.println("Value of the eighth angle: ");
             angle8 = keyboard.nextDouble();
             
             System.out.println("Value of the ninth angle: ");
             angle9 = keyboard.nextDouble();
             
             System.out.println("Value of the tenth angle: ");
             angle10 = keyboard.nextDouble();
             
             System.out.println("Value of the eleventh angle: ");
             angle11 = keyboard.nextDouble();
             
             value = missingAngle(sides, angle1, angle2, angle3, angle4, angle5, angle6, angle7, angle8, angle9, angle10, angle11);
             
             System.out.println("The missing angle in the shape is: " +
                                     value);
             break;
             
             default: System.out.println("Invalid input, try again.");
                  
      }
   
   }
   
   public static double missingAngle(int s, double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double a10, double a11)
   {
   
      double lostAngle;
      
      if (s == 3)
      {
      
         lostAngle = 180.0 - (a1 + a2);
         return lostAngle;
      
      }
      else if (s == 4)
      {
      
         lostAngle = 360.0 - (a1 + a2 + a3);
         return lostAngle;
      
      }
      else if (s == 5)
      {
      
         lostAngle = 540.0 - (a1 + a2 + a3 + a4);
         return lostAngle;
      
      }
      else if (s == 6)
      {
      
         lostAngle = 720.0 - (a1 + a2 + a3 + a4 + a5);
         return lostAngle;
      
      }
      else if (s == 7)
      {
      
         lostAngle = 900.0 - (a1 + a2 + a3 + a4 + a5 + a6);
         return lostAngle;
      
      }
      else if (s == 8)
      {
      
         lostAngle = 1080.0 - (a1 + a2 + a3 + a4 + a5 + a6 + a7);
         return lostAngle;
      
      }
      else if (s == 9)
      {
      
         lostAngle = 1260.0 - (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8);
         return lostAngle;
      
      }
      else if (s == 10)
      {
      
         lostAngle = 1440.0 - (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9);
         return lostAngle;
      
      }
      else if (s == 11)
      {
      
         lostAngle = 1620.0 - (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10);
         return lostAngle;
      
      }
      else
      
         lostAngle = 1800.0 - (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11);
         return lostAngle;
   
   }
   
}