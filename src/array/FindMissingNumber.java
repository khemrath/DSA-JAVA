package array;

import static array.ArrayUtil.printArray;

public class FindMissingNumber {

    public static int findMissingNumber(int[] arr) {
        /* First we calculate the sum of the number 1+2+3+4+5+...+n = n(n+1)/2
           Then we get that total sum minus our items in our array then we will find the missing one
           ex. [3, 2, 1, 5]
                5(5 + 1)/2 = 15
                missingNumber = 15-3-2-1-5 = 4
        * */
        int totalNumberSize = arr.length + 1;
        int totalSum = totalNumberSize * (totalNumberSize + 1) / 2;
        int tempMissingNumber = totalSum;
        for(int i : arr) {
            tempMissingNumber = tempMissingNumber - i;
        }
        return tempMissingNumber;
    }

    public static void main() {
        int[] numbers = {4, 1, 6, 3, 2};
        printArray(numbers);
        int missingNumber = findMissingNumber(numbers);
        System.out.println(missingNumber);
    }
}
