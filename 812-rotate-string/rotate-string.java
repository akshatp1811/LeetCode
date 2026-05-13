class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length();
        if(s.length() != goal.length())
            return false;
        for(int i = 0; i < len; i++){
            s = s.substring(1,len) + s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}