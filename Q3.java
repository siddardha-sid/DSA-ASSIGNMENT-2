import java.util.HashMap;

public class Q3 {

	public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
       
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        
        for (int x : freqMap.keySet()) {
            if (freqMap.containsKey(x + 1)) {
                maxLength = Math.max(maxLength, freqMap.get(x) + freqMap.get(x + 1));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println("Output: " + result); 
    }

}
