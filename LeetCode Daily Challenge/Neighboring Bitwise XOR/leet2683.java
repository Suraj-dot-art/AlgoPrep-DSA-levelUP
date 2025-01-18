class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans = 0;
        int n = derived.length;

        for (int i = 0; i < n; i++) {
            ans = ans ^ derived[i];
        }

        if (ans == 0)
            return true;
        else
            return false;
    }
}

// If u do the xor of all u will see every element in doing its operation 2
// times
// we know if we do the xor of 2 with 2 means (an element with it again)
// it would come zero
// that means if the XOR of all comes 0 return true