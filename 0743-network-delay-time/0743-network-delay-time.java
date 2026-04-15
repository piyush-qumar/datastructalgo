class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        //djikstra

        //building adjacency list and initialising it
        Map<Integer, List<int[]>>graph = new HashMap<>();
        for(int[] time: times) {
            graph.computeIfAbsent(time[0], x-> new ArrayList<>()).
            add(new int[]{time[1], time[2]});
        }
        //creating a new array to store best possible distance for nodes
        int[] dist = new int[n+1];
        //initalising it with max value initially
        Arrays.fill(dist, Integer.MAX_VALUE);
        //initalising the dist at k, since traversal is beginning from k
        dist[k] = 0;

        //initialize priority queue(min heap)[distance, node]
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)-> a[0]- b[0]);
        pq.offer(new int[]{0,k});

        while(!pq.isEmpty()) {
            int curr[] = pq.poll();
            int time = curr[0];
            int node = curr[1];
            if(time > dist[node]) continue;
            if(!graph.containsKey(node)) continue;
            for(int[] next: graph.get(node)) {
                int nextNode = next[0];
                int nextTime = next[1];

                if(dist[node] + nextTime < dist[nextNode]) {
                    dist[nextNode] = nextTime+dist[node];
                    pq.offer(new int[]{dist[nextNode], nextNode});
                }
            }
        }
        int ans = 0; 
        for (int i = 1; i <= n; i++) { 
            if (dist[i] == Integer.MAX_VALUE) return -1; 
            ans = Math.max(ans, dist[i]); 
            }
            return ans;
    }
}