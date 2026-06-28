class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for(char letter : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==letter){
                stack.pop();
            }
            else {
                stack.push(letter);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}