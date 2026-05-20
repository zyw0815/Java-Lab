import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : arr) list.add(n);

        System.out.println("Before: " + list);
        insertionSort(list);
        System.out.println("After:  " + list);
    }
}
