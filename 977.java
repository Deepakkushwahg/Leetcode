class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] output = new int[size];
        int curr = size-1,p1=0,p2=size-1;
        while(p1<=p2){
            int tempLeft = nums[p1]*nums[p1];
            int tempRight = nums[p2]*nums[p2];
            if(tempLeft>tempRight){
                output[curr--] = tempLeft;
                p1++;
            }
            else{
                output[curr--] = tempRight;
                p2--;
            }
        }
        return output;
    }
}