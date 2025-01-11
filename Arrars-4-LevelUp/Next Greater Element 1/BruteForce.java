public class BruteForce {
    int n = nums1.length;
    int m = nums2.length;

    int[] ans = new int[n];

    for(int x=0;x<n;x++){
        int elem = nums1[x];
        int index = -1;
        for(int i=0;i<m;i++){
            if(nums2[i]==elem){
                index = i;
                break;
            }
        }
        int nextGreater=-1;
        for(int j=index+1;j<m;j++){
            if(nums2[j]>elem){
            nextGreater= nums2[j];
            break;
        }
    }
         ans[x]= nextGreater; 
    }
    
    return ans;
}
}
