package array;

import static array.ArrayUtil.printArray;

public class RemoveEvenInteger {
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                result[idx] = j;
                idx++;
            }
        }
        return result;
    }

    public static void main() {
        int[] arr = {3, 2, 4, 7, 10, 6, 5}; // 3, 7, 5
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);
    }
}
