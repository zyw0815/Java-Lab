class Number {
    static public long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
public class RecursiveFactorial {
    private static int value = 5;
    public static void main(String[] args) {
        System.out.println("The factorial of " + value + " is: " + Number.factorial(value));
    }
}

/*
public class RecursiveFactorial {
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println("The factorial of " + value + " is: " + factorial(value));
    }
}
*/