class Solution {
    public int arrangeCoins(int n) {
        // O(n) time complexity solution

         long count = 0, i=0;
         for(i=0;i<n;i++){
             count+=i+1;
             if(count>=n) break;
         }
         if(count>n) return (int)i;
         return (int)i+1;

        // O(logn) time complexity solution

         long left = 0, right = n;
         while(left<=right){
             long mid = left+(right-left)/2;
             long k = mid*(mid+1)/2;
             if(k==n) return (int)mid;
             if(k>n) right = mid-1;
             else left = mid+1;
         }
         return (int)right;

        // O(1) time complexity solution
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
}