class Solution {
    private boolean feasible(int[] piles,int mid,int h){
        long totalhours=0;

        for(int pile :piles){
            totalhours+=(pile+mid-1)/mid;
        }
        return totalhours<=h;
   }
    public int minEatingSpeed(int[] piles, int h) {
           int end=0;
           for(int pile: piles)end=Math.max(end,pile);
           int start=1, ans=end;


           while(start<=end){
            int mid=start+(end-start)/2;

            if (feasible(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
           }
           return ans;
    }
}