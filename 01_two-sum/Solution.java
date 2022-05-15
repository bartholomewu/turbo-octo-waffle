import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int key;
        for (int i = 0; i < nums.length; i++){
            key = target - nums[i];
            if (hashMap.containsKey(key)){
                return new int[]{hashMap.get(key), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }

}