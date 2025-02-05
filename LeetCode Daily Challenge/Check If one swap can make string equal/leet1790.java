class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int m = s1.length();
        int count = 0;
        int firstIndex = -1;    //hint of leetcode
        int secondIndex = -1;

        for(int i=0;i<m;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count ++;

                if(count == 1) firstIndex = i;  //store the index of first mismatched character
                else if(count == 2) secondIndex = i; //store the index of second mismatched character
                else return false;
            }
        }

        if(count == 0)return true;
        if(count == 2){
            if(s1.charAt(firstIndex) == s2.charAt(secondIndex) && s1.charAt(secondIndex) == s2.charAt(firstIndex)){
                return true;
            }
        }
        return false;

    }
}
