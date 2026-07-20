/Finding Greatest Common divisor
class learn{
	    public static int gcd(int a, int b) {
	        while (b != 0) {
	            int rem = a % b;
	            a = b;
	            b = rem;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        int[] arr = {4, 6, 8, 10};

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                System.out.println("(" + arr[i] + ", " + arr[j] + ") -> GCD = " + gcd(arr[i], arr[j]));
	            }
	        }
	    }
	}

| Iteration | a | b | rem = a % b | New a | New b |
| --------- | - | - | ----------- | ----- | ----- |
| Start     | 4 | 6 | -           | 4     | 6     |
| 1         | 4 | 6 | 4           | 6     | 4     |
| 2         | 6 | 4 | 2           | 4     | 2     |
| 3         | 4 | 2 | 0           | 2     | 0     |

Final Answer: gcd(4, 6) = 2
