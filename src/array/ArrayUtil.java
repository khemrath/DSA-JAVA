package array;

public class ArrayUtil {
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5]; // default value
        // printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        myArray[2] = 9;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int[] arr = {5, 1, 8, 10};
        printArray(arr);
    }

    public static void main() {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
        arrUtil.printArray(new int[]{5, 1, 2, 9, 10});
    }
}
