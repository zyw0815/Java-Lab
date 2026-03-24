import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Scanner sc = null;
        int d = 0;

        try {
            sc = new Scanner(System.in);
            System.out.print("Enter the number of left rotations: ");
            d = sc.nextInt();
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }

        int[] rotatedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArr[i] = arr[(i + d) % arr.length];
        }
        System.out.print("Array after " + d + " left rotations: ");
        for (int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}