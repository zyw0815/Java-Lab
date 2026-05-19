import java.io.*;

public class Task5_5_FileUppercase {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter fw = new BufferedWriter(new FileWriter("output.txt"));

        while (true) {
            try {
                String line = fr.readLine();
                if (line == null) {
                    break;
                }
                fw.write(line.toUpperCase());
                fw.newLine(); // Deal with the line break
            } catch (IOException e) {
                System.err.println("An error occurred while reading or writing the files.");
            }
        }

        try {
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("Failed to close the files.");
        }
    }
}
