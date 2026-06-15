class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;

        //left ele
        for(int i=0;i<n-1;i++){
            ans[i+1]=ans[i]*nums[i];
        }

        //right ele=1;
        int rightprd=1;

        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*rightprd;
            rightprd*=nums[i];
        }
        
        return ans;


    }
}