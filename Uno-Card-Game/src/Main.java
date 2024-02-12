import cards.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static boolean exitLoop;
    public static void main(String[] args) {
        GreenCard card = new GreenCard();
        System.out.println(card.numGen());
        System.out.println(card.colorGen());










        Scanner scanner = new Scanner(System.in);
        int userOption =  0;
        System.out.println("    Welcome to Uno!");
        do {
            exitLoop = true;
            try {

                System.out.println("   Select an option: ");
                System.out.println("=======================");
                System.out.println("\t  Rules: 1 ");
                System.out.println("\t   Play: 2 ");
                System.out.println("\t   Exit: 3 ");
                userOption = scanner.nextInt();
                GameLoop game = new GameLoop(userOption);

            } catch (InputMismatchException e) {
                System.out.println("=======================");
                System.out.println("Input a correct option.");
                System.out.println("=======================");
                exitLoop = true;
                scanner.nextLine();
            }

        } while(exitLoop);



    }
}