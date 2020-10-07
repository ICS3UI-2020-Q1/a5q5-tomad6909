import java.util.Scanner;
/**
 * This program asks a user for a number between 1 and 10 and draw a line of * that is the size that was asked for
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user for a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");
    int integer = input.nextInt();

    for(int count = 1; count <= integer; count++){
      System.out.print("*");
    }
      
    
    
  }
}
