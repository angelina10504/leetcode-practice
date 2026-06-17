class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int[] res=new int[n];
        int left=0, right=n-1;
        int pos=n-1;

        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];

            if(leftsq> rightsq){
                res[pos]=leftsq;
                left++;
            }else{
                res[pos]=rightsq;
                right--;
            }
            pos--;
        }
        return res;
    }
}