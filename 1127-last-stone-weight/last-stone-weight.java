class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int stone : stones){
            pq.add(stone);
        }
        while(pq.size() > 1){
            int largest = pq.poll();
            int second_largest = pq.poll();
            int diff = largest - second_largest;
            if(diff != 0){
                pq.add(diff);
            }
        }
        if(!pq.isEmpty()) return pq.peek();
        else return 0;
    }
}