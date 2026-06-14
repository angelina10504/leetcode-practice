class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int currentmax=nums[0];
        int currentmin=nums[0];

        for(int i=1;i<nums.length;i++){
            int temp=currentmax;
            currentmax=Math.max(nums[i],Math.max(currentmax*nums[i],currentmin*nums[i]));
            currentmin=Math.min(nums[i],Math.min(temp*nums[i],currentmin*nums[i]));
            maxprod=Math.max(currentmax,maxprod);
        }
        return maxprod;


    }
}