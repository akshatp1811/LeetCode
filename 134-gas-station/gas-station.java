class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0; i< gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        int start = 0;
        int currFuel = 0;
        if(totalCost > totalGas) return -1;
        for(int i = 0; i< gas.length; i++){
            currFuel = currFuel + gas[i] - cost[i];
            if(currFuel < 0){
                start = i + 1;
                currFuel = 0;
            }
        }
        return start;
    }
}