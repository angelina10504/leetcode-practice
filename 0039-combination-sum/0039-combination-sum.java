class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates,target,0,ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] arr,
            int target,
            int start,
            List<List<Integer>>ans, // final list
            List<Integer> ds ){ //current combination

        if (target ==0){
            ans.add(new ArrayList<>(ds));
            return;
        }   
        for(int i=start;i<arr.length;i++){
            //current ele greater than target
            if(arr[i]>target)break;

            //choose current element
            ds.add(arr[i]);

            //recurse
            //resuse allowed
            backtrack(arr, target-arr[i],i,ans,ds);

            //backtrack
            //remove last chosen ele
            ds.remove(ds.size()-1);
        } 
        }
}