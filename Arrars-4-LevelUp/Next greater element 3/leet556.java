class Solution {
    public int nextGreaterElement(int n) {
        char[] ch = (n + "").toCharArray(); // sometimes the given value can be very large so use char array

        int index = -1;
        for (int i = ch.length - 2; i >= 0; i--) {
            if (ch[i] < ch[i + 1]) {
                index = i; // you got he index of the element which can be swapped
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
                small = j; // you got the element which can be swapped with above found index
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

// if u dont wanna use sort( nlogn ) , use this function instead
// public void reverse(char[] ch , int s, int e){
// while(s<e){
// char temp = ch[s];
// ch[s] = ch[e];
// ch[e] = temp;
// s++;
// e--;
// }

// }