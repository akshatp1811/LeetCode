class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 1;
        int maxLen = 1;
        int n = s.length();
        if(n == 0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(left));
        int len = 0;
        while(right<n){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            len = right-left+1;
            maxLen = Math.max(maxLen, len);
            right = right+1;
        }
        return maxLen;
    }
}