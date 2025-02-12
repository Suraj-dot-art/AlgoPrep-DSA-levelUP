// USING SORTING IN LIST
// class Solution {
// public int maximumSum(int[] nums) {
// int n = nums.length;

// int arr[] = new int[n];
// HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();

// for (int num : nums) {
// int sum = digitSum(num);
// hm.putIfAbsent(sum, new ArrayList<>());
// hm.get(sum).add(num);
// }

// int max = -1;
// for (ArrayList<Integer> list : hm.values()) {
// if (list.size() > 1) {
// Collections.sort(list, Collections.reverseOrder()); // Sort in descending
// order
// max = Math.max(max, list.get(0) + list.get(1)); // Take the top two largest
// values
// }
// }
// return max;
// }
// public int digitSum (int x){
// int sum = 0;
// while(x>0){
// int rem = x % 10;
// sum += rem;
// x = x/10;
// }
// return sum;
// }
// }
// THIS IS USING INT[] WITH JUST 2 SPACE AND TAKING THE MAX OF IT
// class Solution {
// public int maximumSum(int[] nums) {
// int n = nums.length;
// HashMap<Integer, int[]> hm = new HashMap<>(); // Store top 2 max elements for
// each digit sum

// for (int i = 0; i < n; i++) {
// int sum = digitSum(nums[i]);

// // Get top two largest elements
// if (!hm.containsKey(sum)) {
// hm.put(sum, new int[]{-1, -1});
// }

// int[] topTwo = hm.get(sum);
// if (nums[i] > topTwo[0]) {
// topTwo[1] = topTwo[0];
// topTwo[0] = nums[i];
// } else if (nums[i] > topTwo[1]) {
// topTwo[1] = nums[i];
// }
// }

// int max = -1;
// for (int[] topTwo : hm.values()) {
// if (topTwo[1] != -1) { // Ensure we have at least two elements
// max = Math.max(max, topTwo[0] + topTwo[1]);
// }
// }
// return max;
// }
// public int digitSum (int x){
// int sum = 0;
// while(x>0){
// int rem = x % 10;
// sum += rem;
// x = x/10;
// }
// return sum;
// }
// }