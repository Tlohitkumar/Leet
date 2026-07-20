Finding maximum or minimum sub array in different approach's

1. Fixed-size subarray (k) → Sliding Window  - Time Complexity: O(n)

public class FixedWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
_____________________________________________________________________________________________________________________

2. Variable-size maximum sum → Kadane's Algorithm - Time Complexity: O(n)

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}
_____________________________________________________________________________________________________________________

3. Variable-size with positive numbers (Sliding Window / Two Pointers) - Time Complexity: O(n)

Problem: Find the longest subarray whose sum is ≤ 7.

public class VariableWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 7;

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}

4) To print the maximum sum subarray

public class KadaneAlgorithm {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);

        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
_____________________________________________________________________________________________________________________

| Problem                                                                                | Technique                     |
| -------------------------------------------------------------------------------------- | ----------------------------- |
| Fixed-size subarray (`k`)                                                              | Sliding Window                |
| Maximum sum with any subarray length (negative numbers allowed)                        | Kadane's Algorithm            |
| Variable-size window with positive numbers and conditions (`sum ≤ k`, `sum < k`, etc.) | Sliding Window / Two Pointers |
