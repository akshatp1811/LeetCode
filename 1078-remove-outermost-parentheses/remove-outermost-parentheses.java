class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();

        int balance = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                if (balance > 0)
                    ans.append(ch);

                balance++;
            }
            else {

                balance--;

                if (balance > 0)
                    ans.append(ch);
            }
        }

        return ans.toString();
    }
}
// My Solution
// class Solution {
//     public String removeOuterParentheses(String s) {
//         if(s.length() == 0)
//         return s;
//         int n = s.length();
//         Stack<Character> st = new Stack<>();
//         int starting = 0;
//         String str = "";
//         for(int i = 0; i< n; i++){
//             if(s.charAt(i) == '(')
//                 st.push('(');
//             else
//                 st.pop();
//             if(st.isEmpty()){
//                 str = str + s.substring(starting + 1, i);
//                 starting = i+1;                
//             }
//         }
//         return str;
//     }
// }