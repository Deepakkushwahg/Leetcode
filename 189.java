class Solution {
    private void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp = nums[low];
            nums[low++] = nums[high];
            nums[high--] = temp;
        }
    }
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k%nums.length-1);
        reverse(nums,k%nums.length,nums.length-1);
    }
}