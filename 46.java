class Solution {
    List<List<Integer>> res;
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        visited = new boolean[nums.length];
        backtrace(nums,new LinkedList<Integer>());
        return res;
    }
    private void backtrace(int[] nums, LinkedList<Integer> list){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            list.add(nums[i]);
            visited[i] = true;
            backtrace(nums,list);
            list.removeLast();
            visited[i] = false;
        }

    }
}