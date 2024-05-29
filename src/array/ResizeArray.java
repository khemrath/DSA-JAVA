package array;

import static array.ArrayUtil.printArray;

public class ResizeArray {

    // void method will get garbage collector by Java
    public int[] resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public void main() {
        int[] original = {2, 11, 5, 10, 7, 8};
        printArray(original);
        int[] resizedArray = resizeArray(original, 9);
        printArray(resizedArray);
    }
}
