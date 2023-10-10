import java.util.Random;
import java.util.Scanner;

public class StenSaxPåse {
    public void startGame() {
        
    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            int numberOfTries = 0;
            boolean guessedCorrectly = false;

            System.out.println("Gissa på ett nummer mellan 1 och 100.");
        while (!guessedCorrectly) {
            System.out.print("Gissning " + (numberOfTries + 1) + ": ");
        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();
                    scanner.nextLine(); 
                    numberOfTries++;

        if (userGuess < 1 || userGuess > 100) {
             System.out.println("Numret måste vara mellan 1 och 100.");
    }   else if (userGuess < randomNumber) {
             System.out.println("Numret är högre.");
    }   else if (userGuess > randomNumber) {
             System.out.println("Numret är lägre.");
    }   else {
             System.out.println("Rätt! Du gissade rätt på " + numberOfTries + " försök.");
                        guessedCorrectly = true;
    }
    }   else {
             System.out.println("Du kan bara skriva med siffror. Försök igen!");
                    scanner.nextLine(); 
                }
            }

            
             System.out.println("Meny:");
             System.out.println("1. Spela igen");
             System.out.println("2. Exit");

             int choice;
            do {
             System.out.print("Mata in ditt val: ");
                while (!scanner.hasNextInt()) {
             System.out.print("Felaktigt val. Mata in ett nummer: ");
                    scanner.next();
                }
                choice = scanner.nextInt();
            } while (choice < 1 || choice > 2);

            if (choice == 2) {
                playAgain = false;
            }
            
        }

        System.out.println("Tack för att du spelade!");
        scanner.close();
    }


    }

