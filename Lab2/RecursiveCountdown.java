public class RecursiveCountdown {
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println(n);
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        countdown(10000);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }
}

// public class RecursiveCountdown {
//     public static void countdown(int n) {
//         for (int i = n; i >= 0; i--) {
//             System.out.println(i);
//         }
//         System.out.println("Blastoff!");
//     }
//     public static void main(String[] args) {
//         long startTime = System.currentTimeMillis();
//         countdown(10000);
//         long endTime = System.currentTimeMillis();
//         System.out.println("Execution time: " + (endTime - startTime) + " ms");
//     }
// }