import java.util.Random;
import java.util.Scanner;

public class main {

    public static int scan() {

        System.out.println("Enter a number from 0-10!");
        Scanner myScanner = new Scanner(System.in);
        int Input = Integer.parseInt(myScanner.nextLine());
        return Input;

    }

    public static int generate() {

        Random myRandom = new Random();
        int Number = myRandom.nextInt(11);
        return Number;

    }

    public static void main(String[] args) {

        int Input = scan();
        int Number = generate();
        if (Number == Input) {
            System.out.println("CORRECT, that was the number!");
        } else {
            System.out.println("WRONG, the number was " + Number + "!");
        }
        }

    }