class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if (s.length()<p.length())return result;
        int[] count_p= new int[26];
        int[] count_win= new int[26];

        for(int i=0;i<p.length();i++ ){
            count_p[p.charAt(i)-'a']++;
            count_win[s.charAt(i)-'a']++;
        }

        if (Arrays.equals(count_win,count_p)) result.add(0);

        int left=0;
        for(int right=p.length();right<s.length();right++){
            count_win[s.charAt(right)-'a']++;
            count_win[s.charAt(left)-'a']--;
            left++;

            if(Arrays.equals(count_win,count_p))result.add(left);
        }
        return result;
    }
}