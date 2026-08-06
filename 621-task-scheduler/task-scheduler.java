class Solution {
    class Pair{
        int freq;
        int wtime;
        Pair(int freq, int wtime){
            this.freq = freq;
            this.wtime = wtime;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        Arrays.fill(freq,0); 
        for(int i = 0 ; i< tasks.length; i++){
            freq[tasks[i] - 'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        Queue<Pair> q = new LinkedList<>();
        for(int frequency : freq){
            if(frequency != 0)
                pq.add(frequency);                
        }
        int time = 0;
        while(!pq.isEmpty() || !q.isEmpty()){
            time++;
            if(!pq.isEmpty()){
                int frequency = pq.poll() - 1;
                if(frequency > 0) q.offer(new Pair(frequency, time + n));
            }
            while (!q.isEmpty() && q.peek().wtime <= time) {
                pq.offer(q.poll().freq);
            }
        }
        return time;
    }
}