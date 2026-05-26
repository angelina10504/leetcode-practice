class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int maxlen=0;
        int []arr=new int[128];
        for(int i=0;i<128;i++){
            arr[i]=-1;
        }
        while(r<s.length()){
            int c=s.charAt(r);
            if(l<=arr[c]){
                l=arr[c]+1;
            }
            else{
                maxlen=Math.max(maxlen,r-l+1);
            }
            arr[c]=r;
            r++;
        }
        return maxlen;
    }
}