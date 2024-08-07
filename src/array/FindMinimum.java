package array;

import static array.ArrayUtil.printArray;

public class FindMinimum {

    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main() {
        int[] numbers = {3, 2, 4, 7, 10, 6, 5}; // 3, 7, 5
        printArray(numbers);
        int min = findMinimum(numbers);
        System.out.println(min);
    }
}
