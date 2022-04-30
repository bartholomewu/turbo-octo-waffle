class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;
        while (left < right) {
            int containerHeight = Math.min(height[left], height[right]);
            area = Math.max(containerHeight * (right - left), area);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return area;
        
    }
}