class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        boolean ans = true;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        Arrays.fill(freq1,0);
        Arrays.fill(freq2,0);

        int n = s.length();

        for(int i = 0; i < n; i++){
            freq1[s.charAt(i) - 'a']++;
        }

        for(int j = 0; j < n; j++){
            freq2[t.charAt(j) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(freq1[i] == freq2[i]){
                ans = true;
            }
            else{
                ans = false;
                return ans;
            }
        }

        return ans;
    }
}