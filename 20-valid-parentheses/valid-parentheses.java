class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        for(int i = 0; i < n;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty() && s.charAt(i) == map.get(st.peek())){
                st.pop();
            }
            else
             return false;
        }
        if(!st.isEmpty()){
            return false;
        }
        else return true;
    }
}