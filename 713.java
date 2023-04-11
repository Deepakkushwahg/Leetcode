class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int length = nums.length;
        int count = 0,prod=1,left=0;
        for(int r=0;r<length;r++){
            prod *= nums[r];
            while(prod>=k) {
                prod/=nums[left++];
            }
            count+= r-left+1;
        }
        return count;
    }
}