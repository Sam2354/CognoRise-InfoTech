import java.util.Random;
import java.util.Scanner;

public class Guess{

  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int randomNumber = rand.nextInt(100+1);
    
    int tryCount = 0;
    while(true) {
      System.out.println("Enter your guess (1-100):");
      
      int playerGuess = scanner.nextInt();
      tryCount++;
      
      if (playerGuess == randomNumber) {
        System.out.println("MISSION PASSED(RESPECT +100)");
        System.out.println("It took you " + tryCount + " tries");
        break;
      }
      else if(randomNumber > playerGuess) {
        System.out.println("Nope! try a higher nunber again.");
      }
      else {
        System.out.println("Nope! try a lower number again.");
      }
      if(tryCount>7){
        System.out.println("Wasted");
        break;
      }
    }
    
    
    
    scanner.close();
    
  }
}
