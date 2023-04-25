package Main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int timeGuessed = 0;
        boolean guessRight = false;
        boolean gameFinished = false;

        System.out.println("-------Welcome to Guess the Random Number Game------");
        System.out.println("Firstly, Please let us know thy name:");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("OKAY! Hello " + userName);

        System.out.println("IT'S TIME TO START THE GAME " + userName.toUpperCase() + " ARE YOU READY!!!");
        System.out.println("\t1. HELL YEAHHH! LETS GOOOO");
        System.out.println("\t2. HELL NOOO! I DON'T WANT TO PLAY");
        int userStart = scanner.nextInt();

        while (userStart != 1) {
            System.out.println("OH NO!  " + userName + " YOU ARE TRAP HERE UNLESS YOU PLAY THE GAME! WIN OR LOSE DOESN'T MATTER!");
            System.out.println("\t1. OKAY FINE!");
            System.out.println("\t2. HELL NOOO! I DON'T WANT TO PLAY");
            userStart = scanner.nextInt();
        }

        System.out.println("The Rule is simple select a random number between 1-20. If you guess it right you win. You only have 5 chances thou!!");
        Random random = new Random();
        int randomNumb = random.nextInt(20);
        System.out.print("Now choose your number in the range between 1-20: ");
        int userGuess = scanner.nextInt();
        while (userGuess < 1 || userGuess > 20) {
            System.out.println("HEY! DIDN'T WE TELL YOU TO PICK A NUMBER BETWEEN 1-20 ONLY? PICK AGAIN!");
            userGuess = scanner.nextInt();
        }

        while (!gameFinished) {
            timeGuessed++;
            if (timeGuessed <= 5) {
                if (userGuess == randomNumb) {
                    guessRight = true;
                    gameFinished = true;
                    if (timeGuessed == 1) {
                        System.out.println("FIRST TRY!!! CONGRATULATION!! YOU ARE AMAZING FANTASTIC!");
                    } else if (timeGuessed <= 4) {
                        System.out.println("Congratulation!!! Great job!! You can go now!");
                        System.out.println("You have guess it in your " + timeGuessed + " tries");
                    } else if (timeGuessed == 5) {
                        System.out.println("Did it the last try hah! Consider yourself lucky at least you leave here with some dignity.");
                        System.out.println("You have guess it in your " + timeGuessed + "th tries");
                    }
                } else if (userGuess < randomNumb) {
                    System.out.println("Lemme give you a hint. Just a bit higher.");
                    userGuess = scanner.nextInt();
                } else {
                    System.out.println("Lemme give you a hint. Just a bit lower.");
                    userGuess = scanner.nextInt();
                }
            } else {
                System.out.println("You have exceeded your 5 chances");
                System.out.println("GAME OVER!!! The right number is " + randomNumb + " GET OUTTA HERE LOSER!!");
                gameFinished = true;
            }
        }
    }
}

