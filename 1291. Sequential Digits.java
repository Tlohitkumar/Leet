1291. Sequential Digits
Example 1:

Input: low = 100, high = 300
Output: [123,234]
Example 2:

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]

// class Solution {

//     public boolean isSequential(int n) {

//         while (n >= 10) {
//             int last = n % 10;
//             int secondLast = (n / 10) % 10;

//             if (secondLast + 1 != last) {
//                 return false;
//             }

//             n /= 10;
//         }

//         return true;
//     }

//     public List<Integer> sequentialDigits(int low, int high) {

//         List<Integer> ans = new ArrayList<>();

//         for (int i = low; i <= high; i++) {
//             if (isSequential(i)) {
//                 ans.add(i);
//             }
//         }

//         return ans;
//     }
// }

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> ans = new ArrayList<>();
        String digits = "123456789";

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for (int len = lowLen; len <= highLen; len++) {

            for (int i = 0; i + len <= 9; i++) {

                int num = Integer.parseInt(digits.substring(i, i + len));

                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }
}
