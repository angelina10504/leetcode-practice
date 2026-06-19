class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {findFirst(nums, target), findLast(nums,target)};
    }
    private int findFirst(int[] nums, int target){
        int start=0, end=nums.length-1, ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                ans=mid;
                end=mid-1;
            }
            else if (target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    private int findLast(int[] nums, int target){
        int start=0,end=nums.length-1,ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}