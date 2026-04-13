class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] freq = new int[101];
        int[] result= new int [nums.length-k+1];

        for(int i=0;i<k;i++){
            if(nums[i]<0)freq[nums[i]+50]++;
        }

        result[0]=getxthsmallest(freq,x);

        for(int i=k;i<nums.length;i++){
            if(nums[i]<0)freq[nums[i]+50]++;
            if(nums[i-k]<0)freq[nums[i-k]+50]--;
            result[i-k+1]=getxthsmallest(freq,x);
        }

        return result;
    }
    private int getxthsmallest(int[] freq, int x){
        int count=0;
        for(int i=0;i<50;i++){
            count +=freq[i];
            if(count>=x)return i-50;
        }
        return 0;
    }
}