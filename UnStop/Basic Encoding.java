package UnStop;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FrequencyDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        // Map to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Reading the queries
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            frequencyMap.put(b, frequencyMap.getOrDefault(b, 0) + a);
        }

        // Finding the minimum and maximum frequency
        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;

        // Variables to store the corresponding numbers
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            // Update minimum frequency and corresponding number
            if (freq < minFrequency || (freq == minFrequency && num < minNum)) {
                minFrequency = freq;
                minNum = num;
            }

            // Update maximum frequency and corresponding number
            if (freq > maxFrequency || (freq == maxFrequency && num > maxNum)) {
                maxFrequency = freq;
                maxNum = num;
            }
        }

        // If only one distinct number is present
        if (frequencyMap.size() == 1) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(maxNum - minNum));
        }

        scanner.close();
    }
}
