class Solution {
    public String reverseWords(String s) {

        String snew = new StringBuilder(s).reverse().toString();

        int n = s.length();

        String word = "";
        String ans = "";

        for (int i = 0; i < n; i++) {

            if (snew.charAt(i) == ' ')
                continue;

            while (i < n && snew.charAt(i) != ' ') {
                word = word + snew.charAt(i);
                i++;
            }

            String rew = new StringBuilder(word).reverse().toString();

            if (ans.length() == 0)
                ans = rew;
            else
                ans = ans + " " + rew;

            word = "";
        }

        return ans;
    }
}

// class Solution {
//     public String reverseWords(String s) {
//         String snew = new StringBuilder(s).reverse().toString();
//         int n = s.length();
//         String word = "";
//         String ans = "";
//         for(int i = 0; i < n; i++){
//             while(i<n && snew.charAt(i) != ' '){
//                 word = word + snew.charAt(i);
//                 i++;
//             }
//             String rew = new StringBuilder(word).reverse().toString();
//             ans = ans + " " + rew.trim();
//             word = "";
//         }
//         return ans.trim();
//     }
// }