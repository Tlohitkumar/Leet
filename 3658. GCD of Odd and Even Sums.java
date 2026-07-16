3658. GCD of Odd and Even Sums
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer n. Your task is to compute the GCD (greatest common divisor) of two values:

sumOdd: the sum of the smallest n positive odd numbers.

sumEven: the sum of the smallest n positive even numbers.

Return the GCD of sumOdd and sumEven.
 

Example 1:

Input: n = 4

Output: 4

Explanation:

Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

class Solution {
    public int gcdOfOddEvenSums(int n) {
        ArrayList<Integer> even = new ArrayList<>();
         ArrayList<Integer> odd = new ArrayList<>();
         int i = 1;
        while (odd.size() < n || even.size() < n) {
            if (i % 2 == 0) {
                if (even.size() < n) {
                    even.add(i);
                }
            } else {
                if (odd.size() < n) {
                    odd.add(i);
                }
            }
            i++;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int n1 : odd){
            sum1 += n1;
        }
        for(int n2 : even){
            sum2 += n2;
        }
        return Math.abs(sum1 - sum2);
    }
}