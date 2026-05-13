class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length())
            return false;

        String combined = s + s;

        for(int i = 0; i <= combined.length() - goal.length(); i++) {

            int j;

            for(j = 0; j < goal.length(); j++) {

                if(combined.charAt(i + j) != goal.charAt(j)) {
                    break;
                }
            }

            
            if(j == goal.length())
                return true;
        }

        return false;
    }
}