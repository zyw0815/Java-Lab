class Number {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
public class RecursiveFactorial {
    public static void main(String[] args) {
        Number num = new Number();
        int value = 5;
        System.out.println("The factorial of " + value + " is: " + num.factorial(value));
    }
}

/*
public class RecursiveFactorial {
    public static int factorial(int n) {
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