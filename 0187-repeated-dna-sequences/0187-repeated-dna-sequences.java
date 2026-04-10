class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen=new HashSet<>();
        HashSet<String> repeated = new HashSet<>();
        List<String> result= new ArrayList<>();

        for(int i=0;i<=s.length()-10;i++){
            String window = s.substring(i,i+10);
            if(!seen.add(window)){
                repeated.add(window);
            }
        }
        result.addAll(repeated);
        return result;
    }
}