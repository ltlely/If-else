/*   Write an if-else statement that prints "Goodbye" if userString is "Quit", else prints "Hello". 
End with newline.*/


import java.util.Scanner;

public class DetectWord {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String userString;

      userString = scnr.next();

      /* Your solution goes here  */
      if (userString.compareTo("Quit") == 0) {
      System.out.println ("Goodbye");
      }
      else {
      System.out.println ("Hello");
      }
   

   }
}