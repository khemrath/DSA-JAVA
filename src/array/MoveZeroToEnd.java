package array;

import static array.ArrayUtil.printArray;

public class MoveZeroToEnd {

    public static void moveZeroToEnd(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int lastZeroIndex = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[lastZeroIndex] == 0) {
                temp = arr[i];
                arr[i] = arr[lastZeroIndex];
                arr[lastZeroIndex] = temp;
            }
            if (arr[lastZeroIndex] != 0) {
                lastZeroIndex++;
            }
        }
    }

    public static void main() {
        int[] numbers = {0, 1, 0, 4, 0, 0, 12, 0};
        printArray(numbers);
        moveZeroToEnd(numbers);
        printArray(numbers);
    }
}
