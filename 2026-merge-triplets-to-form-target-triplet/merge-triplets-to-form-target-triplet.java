class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean[] found = new boolean[3];
        for(int i = 0 ; i < triplets.length; i++){
            if(triplets[i][0] > target[0] || triplets[i][1] > target[1] || triplets[i][2] > target[2]){
                continue;
            }
            if(triplets[i][0] == target[0]){
                found[0] = true;
            }
            if(triplets[i][1] == target[1]){
                found[1] = true;
            }
            if(triplets[i][2] == target[2]){
                found[2] = true;
            }
        }
        return (found[0] && found[1] && found[2]);
    }
}