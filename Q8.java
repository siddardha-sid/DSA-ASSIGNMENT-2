
public class Q8 {

	 public static int minScore(int[] nums, int k) {
	        int minNum = Integer.MAX_VALUE;
	        int maxNum = Integer.MIN_VALUE;

	        for (int num : nums) {
	            minNum = Math.min(minNum, num);
	            maxNum = Math.max(maxNum, num);
	        }

	        int difference = maxNum - minNum;
	        return difference <= 2 * k ? difference : difference - 2 * k;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1};
	        int k = 0;

	        int result = minScore(nums, k);
	        System.out.println("Output: " + result); // Output: 0
	    }

}
