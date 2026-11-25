
import java.util.Arrays;

class ArraysDriver
{
    public static void main(String[] args)
    {
        ArrayReq obj = new arraysReq();

        int[] ar = {11, 22, 33, 44, 444};

        // Palindrome Array
        System.out.println("Palindrome Array: "
            + obj.palindromeArray(ar));

        // Binary Search
        int[] searchArray = {10, 20, 30, 40, 50};

        System.out.println("Binary Search Index: "
            + obj.binarySearch(searchArray, 30));

        // Merge Sort
        int[] sortArray = {40, 10, 50, 20, 30};

        obj.mergeSort(sortArray);

        System.out.println("Merge Sort: "
            + Arrays.toString(sortArray));

        // Half Reverse After Sorting
        int[] halfArray = {40, 10, 50, 20, 30};

        int[] result =
            obj.halfReverseArrayAfterSorting(halfArray);

        System.out.println("Half Reverse: "
            + Arrays.toString(result));

        // Static Bubble Sort
        int[] bubbleArray = {50, 20, 40, 10, 30};

        ArrayReq.bubbleSort(bubbleArray);

        System.out.println("Bubble Sort: "
            + Arrays.toString(bubbleArray));
    }
}
