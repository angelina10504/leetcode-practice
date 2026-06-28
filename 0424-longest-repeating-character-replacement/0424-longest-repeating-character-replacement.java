class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,maxfreq=0,maxlength=0;
        int[] count=new int[26];

        for(int r=0;r<s.length();r++){
            count[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,count[s.charAt(r)-'A']);
            while((r-l+1)-maxfreq>k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            maxlength=Math.max(maxlength,r-l+1);
        }
        return maxlength;
    }
}