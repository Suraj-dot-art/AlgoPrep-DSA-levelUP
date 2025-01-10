class Solution {
    public int nextGreaterElement(int n) {
        char[] ch = (n + "").toCharArray();

        int index = -1;
        for (int i = ch.length - 2; i >= 0; i--) {
            if (ch[i] < ch[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return -1;
        }

        int val = ch[index];
        int small = index + 1;
        for (int j = index + 1; j < ch.length; j++) {
            if (ch[j] > val && ch[j] <= ch[small]) {
                small = j;
            }
        }

        char temp = ch[small];
        ch[small] = ch[index];
        ch[index] = temp;

        Arrays.sort(ch, index + 1, ch.length);

        long ans = Long.parseLong(new String(ch)); // int ans = Integer.parseInt(new String(ch));

        if (ans > Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) ans;
        }
    }
}