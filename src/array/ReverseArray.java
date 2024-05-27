package array;

public class ReverseArray {

    public static void reverseArray(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main() {
        int[] numbers = {2, 11, 5, 10, 7, 8};
        printArray(numbers);
        reverseArray(numbers, 0, numbers.length - 1);
        printArray(numbers);
    }
}
