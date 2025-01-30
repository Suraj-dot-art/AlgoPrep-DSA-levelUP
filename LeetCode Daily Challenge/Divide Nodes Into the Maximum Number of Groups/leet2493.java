class Solution {
    public int magnificentSets(int n, int[][] edges) {
        var g = new List[n + 1];
        for (int i = 1; i <= n; i++) g[i] = new ArrayList<Integer>();
        for (var edge : edges) {
            g[edge[0]].add(edge[1]);
            g[edge[1]].add(edge[0]);
        }
        
        var d = new int[n + 1];
        for (int i = 0; i <= n; i++) d[i] = -i;
        var q = new LinkedList<Integer>();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (d[i] >= 0) continue;
            q.addLast(i);
            d[i] = 1;
            int maxDepth = 0;
            while (!q.isEmpty()) {
                var cur = q.removeFirst();
                maxDepth = Math.max(maxDepth, depth(cur, g));
                var nextd = 1 - d[cur];
                for (var nextO : g[cur]) {
                    var next = (int) nextO;
                    if (d[next] >= 0) {
                        if (d[next] != nextd) return -1;
                        continue;
                    }
                    d[next] = nextd;
                    q.addLast(next);
                }
            }
            res += maxDepth;
        }
        return res;
    }

    int depth(int start, List[] g) {
        var q = new LinkedList<Integer>();
        q.addLast(start);
        var depth = new int[g.length];
        int maxDepth = 1;
        depth[start] = 1;
        while (!q.isEmpty()) {
            var cur = q.removeFirst();
            for (var nextO : g[cur]) {
                var next = (int) nextO;
                if (depth[next] != 0) continue;
                maxDepth = Math.max(maxDepth, depth[next] = (depth[cur] + 1));
                q.addLast(next);
            }
        }
        return maxDepth;
    }
}