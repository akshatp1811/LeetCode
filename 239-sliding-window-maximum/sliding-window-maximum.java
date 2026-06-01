class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            //If the size of the sliding window is maintained
            while(!dq.isEmpty() && dq.getFirst() <= i-k){
                dq.removeFirst();
            }
            //Maintiain Monotonic Stack 
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            //If the window size has started then start updating the answer array add the dq.getFirst in the array as because of the monotonic stck it will be present at the staring of the dequee
            if(i>= k-1){
                list.add(nums[dq.getFirst()]);
            }
        }
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return arr;
    }
}