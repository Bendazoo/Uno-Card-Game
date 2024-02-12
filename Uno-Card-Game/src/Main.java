import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userOption;
        boolean error;

        System.out.println("    Welcome to Uno!");
        do {
            error = false;
            try {

                System.out.println("   Select an option: ");
                System.out.println("=======================");
                System.out.println("\tRules: 1 ");
                System.out.println("\tPlay: 2 ");
                System.out.println("\tExit: 3 ");
                userOption = scanner.nextInt();

            } catch (InputMismatchException e) {

                System.out.println("Input a correct option.");
                System.out.println("=======================");
                error = true;
                scanner.nextLine();

            }
        } while(error);



    }
}