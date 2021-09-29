import java.util.Random;
import java.util.Scanner;
import  static java.lang.System.out;
public class Game {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print( "Enter a number from 1 to 10:");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random() .nextInt(10) + 1;
        if (inputNumber == randomNumber) {
            out.println("****************");
            out.println("*You  are win!!!*");
            out.println("****************");
        } else {
            out.println("*You are lose*");
            out.println("*Random number is ");
            out.println(randomNumber + ".");
        }
        out.println("Thank you for the game ");


    }
}
