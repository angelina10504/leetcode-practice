class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates,target,0,ans, new int[target], 0);
        return ans;
    }
    public void backtrack(int[] arr,
            int target,
            int start,
            List<List<Integer>>ans, // final list
            int[] ds,
            int dsSize ){ //current combination

        if (target ==0){
            List<Integer> combo= new ArrayList<>(dsSize);
            for (int i=0;i <dsSize ;i++) combo.add(ds[i]);
            ans.add(combo);
            return;
        }   
        for(int i=start;i<arr.length;i++){
            //current ele greater than target
            if(arr[i]>target)break;

            ds[dsSize] = arr[i];              // add (no autoboxing!)
            backtrack(arr, target - arr[i], i, ans, ds, dsSize + 1); // remove = just don't increment dsSize
        } 
        }
}