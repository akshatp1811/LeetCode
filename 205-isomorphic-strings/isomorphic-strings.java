import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // If mapping already exists
            if (map.containsKey(ch1)) {

                // Mapping mismatch
                if (map.get(ch1) != ch2) {
                    return false;
                }
            }
            else {

                // Another character already mapped to ch2
                if (used.contains(ch2)) {
                    return false;
                }

                map.put(ch1, ch2);
                used.add(ch2);
            }
        }

        return true;
    }
}

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         int slen = s.length();
//         int tlen = t.length();

//         if (slen != tlen)
//             return false;
//         else if(slen == 1 && tlen == 1){
//             return true;
//         }

//         int min = Math.min(slen, tlen);

//         boolean isIsomorphic = false;

//         HashMap<Character, Character> map = new HashMap<>();

//         for (int i = 0; i < min; i++) {

//             char ch1 = s.charAt(i);
//             char ch2 = t.charAt(i);

//             if (map.containsKey(ch1)) {

//                 if (map.get(ch1) != ch2) {
//                     isIsomorphic = false;
//                     return isIsomorphic;
//                 }

//                 if (map.get(ch1) == ch2) {
//                     isIsomorphic = true;
//                     return isIsomorphic;
//                 }
//             }

//             else {
//                 map.put(ch1, ch2);
//             }
//         }
//         return isIsomorphic;
//     }
// }