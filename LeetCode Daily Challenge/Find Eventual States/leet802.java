class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        HashMap< Integer , Boolean> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(dfs(i,graph,hm)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean dfs(int node , int[][] graph , HashMap<Integer,Boolean> hm){
        if(hm.containsKey(node)){
            return hm.get(node);
        }
        hm.put(node,false);
        for(int neighbour : graph[node]){
                if(!dfs(neighbour, graph , hm)){
                return false;
            }
        }

        hm.put(node,true);
        return true;
    }
}