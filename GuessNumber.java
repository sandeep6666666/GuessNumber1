import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
    public static void main(String a[]){
        Scanner reader = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes")){
            int guess=-1;
            int tries=0;
            Random rand  = new Random();
            int ComptNumber = rand.nextInt(100);
            while(guess!=ComptNumber){
                System.out.println("Guess a number between 1 and 100");
                guess =reader.nextInt();
                tries++;
                if(guess==ComptNumber){
                    System.out.println("Awesome! you guessed the numner right in just " +tries+ " guesses.The number is "+ ComptNumber);
                    System.out.println("Did you like to play again?  (yes|no):");
                    play=reader.next().toLowerCase();
                }
                else if(guess > ComptNumber){
                    System.out.println("Your guess is too high, try again.");
                }
                else{
                    System.out.println("your guess is too low, try again.");
                }
            }
        }
        reader.close();
    }
}