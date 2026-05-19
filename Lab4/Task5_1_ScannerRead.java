import java.util.*;

public class Task5_1_ScannerRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");

        try {
            int num = scanner.nextInt();
            System.out.println("The input integer number is " + num);
        } catch (InputMismatchException e) {
            System.err.println("The input should be an integer.");
        }
        finally{
            scanner.close();
        }
    }
}
