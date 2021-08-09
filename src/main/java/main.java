import java.util.Scanner;
import java.util.Random;
public class main {

    public static void main(String[] args){

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        hello.enterName();
        System.out.println("Would you like a survey? (yes/no)");

        Scanner input = new Scanner(System.in);
        String response = input.next();

        if (response.equals("yes")){
            System.out.println("Okay lets go");
        } else {
            System.out.println("Have a good day");
            System.exit(0);
        }

        String petName;
        String favAct;
        int petAge;
        int luckyNum;
        int jerseyNum;
        int carYear;
        int enteredNum;

        System.out.println("What is your favorite pet's name?");
        petName = input.next();

        System.out.println("How old is " + petName + "?");
        petAge = input.nextInt();

        System.out.println("What is your lucky number?");
        luckyNum = input.nextInt();

        System.out.println("What is your favorite athlete's jersey number?");
        jerseyNum = input.nextInt();

        System.out.println("What is the two-digit model year of your car? (For a 2000 year model, enter 00)");
        carYear = input.nextInt();

        System.out.println("Please enter a random number between 1 and 50");
        enteredNum = input.nextInt();

        System.out.println("What is your favorite actor/actress's first name?");
        favAct = input.next();
        System.out.println();

        Random randNumGenerator = new Random();

        int randomNum1 = randNumGenerator.nextInt(75);
        int randomNum2 = randNumGenerator.nextInt(65);

        int magicBall = randomNum1 * jerseyNum;

        while (magicBall > 75){
            magicBall -= 75;
        }

        int lottery1 = luckyNum + carYear;
        int lottery2 = petAge + carYear;
        int lottery3 = 42;
        int lottery4 = jerseyNum + petAge + luckyNum;
        while (lottery4 > 65){
            lottery4 -= 65;
        }
        int lottery5 = favAct.charAt(0);

        System.out.println("Lottery Numbers: " + lottery1 + " " + lottery2 + " " + lottery3 + " " + lottery4 + " "
                + lottery5 + " " + "Magic Ball: " + magicBall);
    }

}
