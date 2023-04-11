class Solution {
    public int search(int[] nums, int target) {
        int first = 0,last = nums.length-1,mid;
        while(first<=last){
            mid = first + (last-first)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid]<target)
                first = mid+1;
            else
                last = mid-1;
        }
        return -1;
    }
}