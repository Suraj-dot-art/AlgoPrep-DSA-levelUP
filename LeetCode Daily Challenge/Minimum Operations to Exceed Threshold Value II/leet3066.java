class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            pq.add((long)nums[i]);
        }

        int count = 0;
    
        while(pq.peek() < k){
            long x = pq.poll();
            if(!pq.isEmpty()){
                long y = pq.poll();
                pq.add((long)x*2+y);
                count++;
            }else{
                break;
            }
            
        }
        return count;
    }
}