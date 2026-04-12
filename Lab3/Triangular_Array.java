public class Triangular_Array {
    public static void main(String args[]) {
        // Initialize a triangular array with 10 rows
        int[][] ts = new int[10][];

        for(int i = 0; i < ts.length; i++) {
            // Create a new array for each row with a length of i + 1
            ts[i] = new int[i + 1];
            for(int j = 0; j < ts[i].length; j++) {
                ts[i][j] = i + j;
                System.out.print(ts[i][j] + " ");
            }
            System.out.println();
        }
    }
}