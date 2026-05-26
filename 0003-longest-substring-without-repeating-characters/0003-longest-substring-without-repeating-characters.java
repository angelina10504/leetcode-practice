class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map=new int[128];
        Arrays.fill(map,-1);

        int maxlength=0;
        int left=0;

        for (int right=0;right<s.length();right++){
            char currentChar = s.charAt(right);

            if(map[currentChar]>=left){
                left=map[currentChar]+1;
            }
            map[currentChar]=right;
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}