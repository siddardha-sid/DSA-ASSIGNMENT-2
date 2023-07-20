import java.util.Arrays;

public class Q5 {

	public static int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);

        // Calculate the maximum product
        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int result = maximumProduct(nums);
        System.out.println("Output: " + result); 
    }

}
