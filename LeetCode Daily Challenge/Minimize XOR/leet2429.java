class Solution {
    public int minimizeXor(int num1, int num2) {
        int ans = 0;

        // int setBitCount = 0; // 1st way to count setBit
        // while(num2 > 0){
        // num2 = num2 & (num2 - 1);
        // setBitCount++; //num2 ke setBit count karo
        // }
        int setBitCount = Integer.bitCount(num2); // find set bits in num2 --> 2nd way to count setBit
        int bit = 31; // kyuki right se chaiye num1 ke tabhi ans ke saath XOR karenge to min aaega

        while (bit >= 0 && setBitCount > 0) {
            if ((num1 & (1 << bit)) != 0) { // check if bit is set in num1 and if so, set the bit in ans
                ans = ans | (1 << bit);
                setBitCount--;
            }
            bit--;
        }

        bit = 0; // agar set ho gyi ans me or num2 ke setBit ke equal karna baaki he to LSB se
                 // set kardo

        while (bit < 32 && setBitCount > 0) {
            if ((num1 & (1 << bit)) == 0) { // jo bhit left side se 0 hoga use 1 kardo equal karne ke liye
                ans = ans | (1 << bit);
                setBitCount--;
            }
            bit++;
        }

        return ans;

    }
}