class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[]ans = new int[n1];
        for(int i=0;i<n1;i++){
            int idx = -1;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    idx = j;
                    break;
                }
            }
            int flag = 0;
            for(int k=idx+1;k<n2;k++){
                if(nums2[k]>nums2[idx]){
                    ans[i] = nums2[k];
                    flag = 1;
                    break;
                }
                
            }
            if(flag==0) ans[i] = -1;
        }
        return ans;
    }
}