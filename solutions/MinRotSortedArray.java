package solutions;

public class MinRotSortedArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int minele = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[high]) {
                minele = Math.min(minele, nums[low]);
                break;
            }
            if (nums[low] <= nums[mid]) {
                minele = Math.min(minele, nums[low]);
                low = mid + 1;
            } else {
                minele = Math.min(minele, nums[mid]);
                high = mid - 1;
            }
        }
        return minele;
    }
}
