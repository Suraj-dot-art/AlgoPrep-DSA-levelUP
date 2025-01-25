//pretty good question for microsoft

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] sortArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortArray[i] = nums[i];
        }
        Arrays.sort(sortArray);

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Deque<Integer>> list = new ArrayList<>();

        int groupIndex = 0;
        list.add(new LinkedList<>());
        list.get(groupIndex).offer(sortArray[0]);
        hm.put(sortArray[0], groupIndex);

        for (int i = 1; i < n; i++) {
            // [[a],[]]
            if (sortArray[i] - list.get(groupIndex).peekLast() > limit) {
                groupIndex++;
                list.add(new LinkedList<>());
            }
            hm.put(sortArray[i], groupIndex);
            list.get(groupIndex).add(sortArray[i]);
        }

        for (int i = 0; i < n; i++) {
            int gi = hm.get(nums[i]);
            nums[i] = list.get(gi).poll();
        }
        return nums;

    }
}