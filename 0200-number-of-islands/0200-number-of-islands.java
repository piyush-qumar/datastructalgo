class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count=0;
        int[][] direction = {{0,1}, {0, -1}, {1,0}, {-1, 0}};
        for(int r=0;r<row;r++) {
            for(int c=0;c<column;c++) {
                if(grid[r][c]=='1') {
                    count++;
                    grid[r][c]='0';
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{r,c});

                    while(!q.isEmpty()) {
                        int[] poll = q.poll();
                        for(int[]d: direction) {
                            int nr = poll[0] + d[0];
                            int nc = poll[1] + d[1];
                            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='1') {
                                grid[nr][nc] = '0';
                                q.offer(new int[]{nr, nc});
                            }
                        }
                    }
                    
                }
            }
        }
        return count;
    }
}