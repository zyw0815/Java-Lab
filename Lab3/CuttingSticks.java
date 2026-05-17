import java.util.Arrays;

public class CuttingSticks {
    public static void main(String[] args) {
        int[] sticks = {2, 3, 5, 5, 2};

        Arrays.sort(sticks);
        int n = sticks.length;

        int i = 0;
        while (i < n) {
            int current = sticks[i];
            while (i < n && sticks[i] == current) {
                i++;
            }
            System.out.println(n - i);
        }
    }
}
