class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        //product of ele to the left
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }

        //prd of ele to the right
        int rightprd=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rightprd;
            rightprd*=nums[i];
        }
        return ans;
    }
}