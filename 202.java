class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int sum = 0;
            if(!set.contains(n)) set.add(n);
            else return false;
            while(n>0){
                int x = n%10;
                sum+=x*x;
                n=n/10;
            }
            n = sum;
        }
        return true;
    }
}