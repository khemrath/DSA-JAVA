package array;

import static array.ArrayUtil.printArray;

public class FindSecondMaximum {

    public static int findSecondMaximum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;
    }

    public static void main() {
        int[] numbers = {3, 2, 4, 7, 10, 6, 5, 8};
        printArray(numbers);
        int secondMax = findSecondMaximum(numbers);
        System.out.println(secondMax);
    }
}
