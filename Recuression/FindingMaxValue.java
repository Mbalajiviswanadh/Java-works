package Recuression;

import java.util.Scanner;

public class FindingMaxValue {

    public static int findMaxValue(int array[], int index, int max) {
        // Base case: if index reaches the end of the array
        if (index == array.length) {
            return max;
        }
        
        // Update max if current element is greater
        if (array[index] > max) {
            max = array[index];
        }

        // Recursive case: find maximum value in the rest of the array
        return findMaxValue(array, index + 1, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        System.out.println("Enter values:");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Call the recursive function to find the maximum value
        int max = findMaxValue(array, 0, Integer.MIN_VALUE);
        System.out.println("Maximum value in the array: " + max);
    }
}
