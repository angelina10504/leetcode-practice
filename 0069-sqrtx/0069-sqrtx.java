class Solution {
    public int mySqrt(int x) {
        if (x==0){return 0;}
        if (x==1){return 1;}
        int start=0, end=x;
        int ans=0;

        while(start<=end){
            long mid=start+(end-start)/2;

            if (mid*mid==x){
                return (int)mid;
            }
            else if (mid*mid<x){
                ans=(int)mid;
                start=(int)mid+1;
            }
            else{
                end=(int)mid-1;
            }
        }
        return ans;
    }
}