import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array 1: ");
        int size1 = scanner.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the array 2: ");
        int size2 = scanner.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        System.out.println("Median of Sorted Array : " + findMedianSortedArrays(array1, array2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size = nums1.length + nums2.length;

        int[] mergedArray = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .sorted()
                .toArray();

        if(size % 2 == 1) {
            int mid = (size-1)/2;

            return mergedArray[mid];
        }

        else {
            int mid = size/2;

            return (double) (mergedArray[mid - 1] + mergedArray[mid]) / 2 ;
        }

    }

}