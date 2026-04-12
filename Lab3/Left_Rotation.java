import java.util.Scanner;

public class Left_Rotation {
    public static void main(String[] args) {
        String[] arr = new String[4];
        int d = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Input:");
            d = sc.nextInt();
            // Delete the space before first string
            // \\s+ match the one or more spaces between strings
            arr = sc.nextLine().trim().split("\\s+");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an string.");
            return;
        } finally {
            sc.close();
        }

        String[] rotatedArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArr[i] = arr[(i + d) % arr.length];
        }
        System.out.println("Output:");
        for (int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}