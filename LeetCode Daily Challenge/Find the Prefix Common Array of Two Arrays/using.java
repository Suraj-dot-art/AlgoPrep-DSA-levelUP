package LeetCode Daily Challenge.Find the Prefix Common Array of Two Arrays;

public class using-HashMap {
    int n = A.length;
    int[] ans = new int[n];
    HashMap<Integer,Integer> hm = new HashMap<>();
    int count =0;

    for(int i=0;i<n;i++){
        hm.put(A[i] , hm.getOrDefault(A[i] ,0)+1);
        hm.put(B[i] , hm.getOrDefault(B[i] ,0)+1);
        
        if(hm.get(A[i]) > 1){
            count ++;
        }
        if(hm.get(B[i]) > 1){
            count ++;
        }
        if(A[i] == B[i]){
            count--;
        }
        ans[i] = count;
    }
    return ans;
}
