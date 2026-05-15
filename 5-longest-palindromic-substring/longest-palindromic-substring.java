class Solution {
    public String longestPalindrome(String s) {
        String str;
        String LongestStr = "";
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j< s.length(); j++){
                str = s.substring(i,j+1);
                if(isPalindrome(str)){
                    if(str.length() > maxLen)
                        LongestStr = str;
                    maxLen = Math.max(maxLen,str.length());
                }                
            }
        }
        return LongestStr;
    }
    public boolean isPalindrome(String s) {
        if(s.length() == 1)
        return true;

    int left = 0;
    int right = s.length() - 1;

    while(left < right) {

        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }

        left++;
        right--;
    }

    return true;
}
}