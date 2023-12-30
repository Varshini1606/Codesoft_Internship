import java.util.Scanner;
import java.util.Random;

public class Numberguessgame {
    public static void main(String[] args) {
        System.out.println("****** WELCOME TO NUMBER GAME ******");
        System.out.println("***** RULES *****");
        System.out.println("You have to guess the number between 1 to 100");
        System.out.println("You will have 5 chances");
        Random rando = new Random();
        int attemptsLimit = 5, count = 0;
        boolean x = false;
        int randomnumber = rando.nextInt(100) + 1;
        try (Scanner sc = new Scanner(System.in)) {
            while (attemptsLimit > 0) {
                for (count = 1; count <= attemptsLimit; count++) {
                    System.out.println("Enter your guess:");
                    int guessnumber = sc.nextInt();
                    if (guessnumber == randomnumber) {
                        System.out.println("Congratulations You got it!The number was: " + randomnumber + ".");
                        break;
                    } else if (guessnumber < randomnumber) {
                        System.out.println("Your guess is too low.Try again.");
                        System.out.println("You are left with " + (attemptsLimit - 1) + " chances");
                        attemptsLimit--;
                    } else {
                        System.out.println("Your guess is too high.Try again.");
                        System.out.println("You are left with " + (attemptsLimit - 1) + " chances");
                        attemptsLimit--;
                    }
                }

            }
            if (x == false) {
                System.out.println("The correct number was:" + randomnumber + ".");
            }
            System.out.println("THANK YOU");
            System.out.println("**** GAME OVER ****");
        }
    }
}