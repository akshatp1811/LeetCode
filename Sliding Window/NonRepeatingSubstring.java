class NonRepeatingSubstring {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        int maxlen = 0;
        int l = 0;
        int r = 0;
        while(r<l ){
            s = s + s.charAt(r);
            hash[r] = hash[r]+1;
            if(hash[r] > 1){
                maxlen = Math.max(maxlen , r-l+1);
                l++;//Shrink
                hash[l] = hash[l]-1;
            }
            r = r+1;
            maxlen = Math.max(maxlen , r-l+1);
        }
        return maxlen;
    
}}   