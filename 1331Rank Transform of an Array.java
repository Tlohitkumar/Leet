1331. Rank Transform of an Array
Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // int arr2[] = arr.clone();
		// Arrays.sort(arr2);
		// HashMap<Integer, Integer> map = new HashMap<>();
		
		//  int rank = 1;

	    //     // Store only unique values
	    //     for (int i = 0; i < arr2.length; i++) {
	    //         if (!map.containsValue(arr2[i])) {
	    //             map.put(rank++, arr2[i]);
	    //         }
	    //     }
		// int index  = 0;
		
		// for(int i=0; i<arr.length; i++) {
		// 	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		// 		if(entry.getValue().equals(arr[i])) {
		// 			arr2[index++] = entry.getKey();
		// 			break;
		// 		}
		// 	}
		// }

         int arr2[] = new int[arr.length];

        // Copy and sort
        int temp[] = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        // Assign rank only for unique elements
        for (int n : temp) {
            if (!map.containsKey(n)) {
                map.put(n, rank++);
            }
        }

        // Replace each element with its rank
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = map.get(arr[i]);
        }
        return arr2;
    }
    
}