public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
                int k = 0; // Pointer to track the position of the valid elements
        
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to 'val', we place it at index 'k'
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // Increment k to point to the next position for valid elements
            }
        }
        return k; // The new length of the array is 'k'
    }
}