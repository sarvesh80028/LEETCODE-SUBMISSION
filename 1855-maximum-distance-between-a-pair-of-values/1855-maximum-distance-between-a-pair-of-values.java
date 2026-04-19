class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int max = Integer.MIN_VALUE;
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                int x = j-i;
                if(x>max) max = x;
                j++;
            }
            else i++;
        }
        if(max==Integer.MIN_VALUE||max<0) return 0;
        return max;
    }
}