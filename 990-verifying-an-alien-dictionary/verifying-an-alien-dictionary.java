class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int first = 0;
        int second = 1;

        while (second < words.length) {

            int i = 0;

            // Compare characters while both words have characters
            while (i < words[first].length() && i < words[second].length()) {

                int firstPos = order.indexOf(words[first].charAt(i));
                int secondPos = order.indexOf(words[second].charAt(i));

                if (firstPos == secondPos) {
                    i++;
                    continue;
                }

                if (firstPos > secondPos) {
                    return false;
                }

                break;
            }

            if (i == words[second].length() && 
                words[first].length() > words[second].length()) {
                return false;
            }

            first++;
            second++;
        }

        return true;
    }
}