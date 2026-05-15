class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if(s.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        long ans = 0;

        // Check sign
        if(s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+') {
            i++;
        }

        // Build number
        while(i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            ans = ans * 10 + digit;

            // Handle overflow
            if(sign * ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if(sign * ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * ans);
    }
}

// //My Approach
// class Solution {
//     public int myAtoi(String s) {
//         String str = s.trim();
//         int n = str.length();
//         int ans = 0;
//         int intChar = 0;
//         boolean isPositive = true;
//         boolean isFirst = true;
//         for(int i = 0;i<n;i++){
//             intChar = (int)str.charAt(i) - 48;
//             if(str.charAt(i) == '+' || str.charAt(i) == '-' || (str.charAt(i) >= '0' && str.charAt(i) <= '9')){//if s.charAT != -,+ or number then return " "
//             if(str.charAt(i) == '0' && isFirst){
//                 continue;
//             }
//             if(str.charAt(i) == '-' && isFirst){
//                 ans =  1;
//                 isPositive = false;
//             }
//             if(str.charAt(i) == '+' && isFirst){
//                 ans = 1;
//             }
//             if(isFirst && str.charAt(i) != '-'){
//                 ans = ans*str.charAt(i);
//                 isFirst = false;
//             }
//             if(!isFirst){
//                 ans = ans*10 + intChar;
//             }
//         }
//             else{
//                 if(isFirst){
//                     return 0;
//                 }
//                 else{
//                     return ans;
//                 }
//             }
//         }
//         if(!isPositive){
//             ans = ans*-1;
//         }
//         if (ans > Integer.MAX_VALUE)
//             return Integer.MAX_VALUE;

//         if (ans < Integer.MIN_VALUE)
//             return Integer.MIN_VALUE;
//         return ans;
//     }
// }