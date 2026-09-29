class Solution {
    String[] letters={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> result=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return result;
        }
        backtrack(digits,0,new StringBuilder());
        return result;
     }   
     void backtrack(String digits, int index, StringBuilder sb){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        String possibleLetters=letters[digits.charAt(index)-'0'];

        for(char ch: possibleLetters.toCharArray()){
            sb.append(ch);
            backtrack(digits,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}