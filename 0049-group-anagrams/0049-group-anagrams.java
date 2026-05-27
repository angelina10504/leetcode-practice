class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>result=new HashMap<>();

        for(String s: strs){
            int[] count = new int[26];

            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            //arrays cannot be used directly as keys, but string can
            String key=Arrays.toString(count);

            if(!result.containsKey(key)){
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }
}