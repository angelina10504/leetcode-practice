class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String token: tokens){
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(Integer.parseInt(token));
            }
            else{
                int x=stack.pop();
                int y=stack.pop();
                int z=0;
                if(token.equals("+"))z=y+x;
                else if(token.equals("-"))z=y-x;
                else if(token.equals("*"))z=y*x;
                else z=y/x;
                stack.push(z);
            }
        }
        return stack.pop();
    }
}