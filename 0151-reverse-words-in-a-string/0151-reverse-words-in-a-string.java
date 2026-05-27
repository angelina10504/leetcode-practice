class Solution {
    public String reverseWords(String s) {
        //1. reverse entire string
        StringBuilder reversestr = new StringBuilder(s).reverse();
        StringBuilder ans=new StringBuilder();
        int n = reversestr.length();

        //2. reverse individual words
        for(int i=0;i<n;i++){
            StringBuilder word =new StringBuilder();

            while(i<n && reversestr.charAt(i)!=' '){
                word.append(reversestr.charAt(i));
                i++;
            }
            if(word.length()>0){
                word.reverse();
                ans.append(" ").append(word);
            }
        }

        //3. remove the first space
        if(ans.length()>0){
            return ans.substring(1);
        }
        return "";
    }
}