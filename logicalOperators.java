import java.util.Scanner;

public class logicalOperators {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      /* Using && */
      int temp = 85;
      if(temp < 45) {
         System.out.println("It is cold outside.");
      } else if(temp >= 85 && temp <= 100) {
         System.out.println("It is very hot outside.");
      } else {
         System.out.println("Its perfect outside.");
      }


      /* Using ||
      System.out.println("You are playing a game! Press Q or q to quit.");
      String response = scanner.next();
      if(response.equals("q") || response.equals("Q")) {
         System.out.println("You quit the game.");
      } else {
         System.out.println("You are still playing the game.");
      } */

      
      /* Using !
      System.out.println("You are playing a game! Press Q or q to quit.");
      String response = scanner.next();
      if(!response.equals("q") && !response.equals("Q")) {
         System.out.println("You are still playing the game.");
      } else {
         System.out.println("You quit the game.");
      } */

      scanner.close();
   }
   
}
