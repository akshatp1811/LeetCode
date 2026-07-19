class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;//To store the number of brackets opened till now when this becomes 0 then depth becomes 0;
        int depth = 0;
        //int[] depthArr = new int[n];
        int maxDepth = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                count++;
                depth++;
            }
            if(s.charAt(i) == ')'){
                count--;
                depth--;
                if(count == 0){
                    depth = 0;
                }
            }
            maxDepth = Math.max(maxDepth, depth);
            
        }
        //int max = Arrays.stream(depthArr).max().getAsInt();
        return maxDepth;
    }
}