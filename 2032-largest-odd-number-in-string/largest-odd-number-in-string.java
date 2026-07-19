class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        int ch;
        String ans = "";
        for(int i = len-1; i>= 0;i--){
            ch = (int)num.charAt(i);
            if(ch%2 != 0){
                ans = num.substring(0,i+1);
                break;
            } 
        }
        return ans;
    }
}