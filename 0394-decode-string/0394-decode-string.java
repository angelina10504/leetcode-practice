class Solution {
    public String decodeString(String s) {
        int currentnum=0;
        StringBuilder currentstr=new StringBuilder();
        Deque<Integer> stacknum=new ArrayDeque<>();
        Deque<StringBuilder> stackstr=new ArrayDeque<>();
        for(char letter: s.toCharArray()){
            if(Character.isDigit(letter)){
                currentnum=currentnum*10 + letter-'0';
            }
            else if (letter=='['){
                stacknum.push(currentnum);
                stackstr.push(currentstr);
                currentnum=0;
                currentstr=new StringBuilder();
            }
            else if (letter==']'){
                int count=stacknum.pop();
                StringBuilder prev=stackstr.pop();
                for(int i=0;i<count;i++){
                    prev.append(currentstr);
                }
                currentstr=prev;
            }
            else{
                currentstr.append(letter);
            }
        }
        return currentstr.toString();

    }
}