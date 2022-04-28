class Solution {
    public int removeDuplicates(int[] nums) {
        int dupes = 0;
        for (int x = 0, y = 1; y < nums.length; y++) {
            if (nums[x] == nums[y]) {
                dupes++;
            } 
            nums[y - dupes] = nums[y];
            x++;
        }
        
        return nums.length - dupes;
    }
}