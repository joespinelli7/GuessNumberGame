import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args){
        // (int) takes floating point num from Math.random() and throws away the fractional part. + 1 on end in case random number is 0
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I am thinking of a number between 1 and 100");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            if (i > 1) {
                System.out.println("You have " + i + " guesses left. Make your choice!");
                int guess = scanner.nextInt();
                if (randomNumber < guess) {
                    System.out.println("It's smaller than " + guess);
                } else if (randomNumber > guess) {
                    System.out.println("It's greater than " + guess);
                } else {
                    hasWon = true;
                    break;
                }
            } else {
                System.out.println("You only have " + i + " guess left. Choose wisely!");
                int guess = scanner.nextInt();
                if (randomNumber < guess) {
                    System.out.println("It's smaller than " + guess);
                } else if (randomNumber > guess) {
                    System.out.println("It's greater than " + guess);
                } else {
                    hasWon = true;
                    break;
                }
            }
        }

        if (hasWon) {
            System.out.println("CONGRATS! You won the game.");
        } else {
            System.out.println("Game over... You lose :(");
            System.out.println("The number was: " + randomNumber);
        }
    }
}
