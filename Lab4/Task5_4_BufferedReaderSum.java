import java.io.*;

public class Task5_4_BufferedReaderSum {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        System.out.print("Enter integers (0 to stop): ");

        while (true) {
            try {
                String line = reader.readLine();
                int num = Integer.parseInt(line);
                if (num == 0) {
                    break;
                }
                sum += num;
            } catch (IOException e) {
                System.err.println("There is an IOException.");
            } catch (NumberFormatException e) {
                System.err.print("Not an integer, try again: ");
            }
        }

        System.out.println("Sum: " + sum);
        try {
            reader.close();
        } catch (IOException e) {
            System.err.println("Failed to close the reader.");
        }
    }
}
