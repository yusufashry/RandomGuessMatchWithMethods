import java.util.Scanner;

public class RandomGuessMatchWithMethods {

    public static void main(String[] args) {
      
        final int MIN = 1;
        final int MAX = 100;

        int random = MIN + (int)(Math.random() * (MAX - MIN + 1));

        int userGuess = getUserGuess(MIN, MAX);

        boolean isMatch = (userGuess == random);
        displayResults(random, userGuess, isMatch);
    }

    public static int getUserGuess(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Guess a number between %d and %d: ", min, max);
        return scanner.nextInt();
    }

    public static void displayResults(int random, int userGuess, boolean isMatch) {
        System.out.println("\nRandom number: " + random);
        System.out.println("Your guess: " + userGuess);
        System.out.println("Did you guess correctly? " + isMatch);
        
        int difference = Math.abs(random - userGuess);
        System.out.println("You were off by: " + difference);
    }
}
