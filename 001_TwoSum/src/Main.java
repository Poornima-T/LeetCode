import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum : ");
        int target = scanner.nextInt();

        System.out.print("Target sum found at : " + Arrays.toString(twoSum(array, target)));

    }

    public static int[] twoSum(int[] array, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i=0; i < array.length; i++) {

            int complement = target - array[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(array[i], i);
            }
        }
        return new int[] {};
    }

}