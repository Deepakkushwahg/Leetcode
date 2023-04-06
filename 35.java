class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target)
            return nums.length;
        if(nums[0]>=target)
            return 0;
        int l=0,r=nums.length-1,mid=0;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                l = mid+1;
            else
                r = mid-1;
        }
        return (nums[mid]<target)?mid+1:mid;

    }
}