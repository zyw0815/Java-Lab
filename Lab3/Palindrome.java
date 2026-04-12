import java.util.Scanner;

class testPalindrome {
    private String str = new String();

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() -1;
        boolean result = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        return result;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        String str = new String();

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Input: ");
            str = sc.nextLine();
        }
        catch (Exception e){
            System.err.println(e);
        }

        System.out.print("Output: ");
        testPalindrome test = new testPalindrome();
        if (test.isPalindrome(str)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}