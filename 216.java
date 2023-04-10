class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        this.backtrack(n,k,comb,0,ans);
        return ans;
    }
    protected void backtrack(int remain, int k, LinkedList<Integer> comb,int start,List<List<Integer>> ans){
        if(remain==0 && comb.size()==k){
            ans.add(new ArrayList<Integer>(comb));
            return;
        }
        else if(remain<0 || comb.size()==k){
            return;
        }
        for(int i=start;i<9;++i){
            comb.add(i+1);
            this.backtrack(remain-i-1,k,comb,i+1,ans);
            comb.removeLast();
        }
    }
}