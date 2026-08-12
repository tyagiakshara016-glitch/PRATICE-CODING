class Solution {
    public void reverseString(char[] s) {
        char[] rev=new char[s.length];
        int a=0;
       for(int i=s.length-1;i>=0;i--){
        rev[a]=s[i];
        a++;
       }
       for(int i=0;i<s.length;i++){
        s[i]=rev[i];
       }
    }
}