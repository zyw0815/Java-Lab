import java.io.*;

public class Task5_3_BufferedReaderRead {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer number: ");

        try {
            String line = reader.readLine();
            int num = Integer.parseInt(line);
            System.out.println("The input integer number is " + num);
        } catch (IOException e) {
            System.err.println("There is an IOException.");
        } catch (NumberFormatException e) {
            System.err.println("The input should be an integer.");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Failed to close the reader.");
            }
        }
    }
}