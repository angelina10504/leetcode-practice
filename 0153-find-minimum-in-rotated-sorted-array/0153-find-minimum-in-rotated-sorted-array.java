class Solution {
    public int findMin(int[] nums) {
        int start= 0;
        int end=nums.length-1;
        int minVal=Integer.MAX_VALUE;

        while(start<=end){
            int mid= start + (end-start)/2;

            //left half sorted
            if(nums[start]<=nums[mid]){
                //if yes, then minVal is the start val
                minVal=Math.min(minVal,nums[start]);
                start=mid+1;
            }
            //right half is sorted
            else{
                //minVal if mid
                minVal=Math.min(minVal,nums[mid]);
                end=mid-1;
            }
        }
        return minVal;
    }
}