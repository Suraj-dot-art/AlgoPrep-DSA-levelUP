//Count Odd Numbers in an Interval Range

class Solution {
    public int countOdds(int low, int high) {
        int a = (high + 1) / 2;
        int b = low / 2;
        return a - b;

    }
}
// we will calculate all odd number from 1 to low-1 and 1 to high;
// why low-1?? because we want include our low value.
// Total odd number between 1 and low - 1 is low/2.
// Total odd number between 1 and high is (high + 1 ) / 2.
