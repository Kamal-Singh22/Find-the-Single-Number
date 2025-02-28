public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num; // XOR all elements
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println("Output 1: " + singleNumber(nums1)); // Output: 1
        System.out.println("Output 2: " + singleNumber(nums2)); // Output: 4
        System.out.println("Output 3: " + singleNumber(nums3)); // Output: 1
    }
}
