import java.util.*;

public class Task5_2_ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter integers (0 to stop): ");

        while (true) {
            try {
                int num = scanner.nextInt();
                if (num == 0) {
                    break;
                }
                sum += num;
            } catch (InputMismatchException e) {
                System.err.print("Not an integer, try again: ");
                scanner.next(); // consume the invalid token
            }
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
