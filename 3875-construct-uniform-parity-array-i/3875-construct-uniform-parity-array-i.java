class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[]nums2 = new int[n];
        int x = 0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0){
                x = nums1[i];
               break;
            }
        }
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0) nums2[i] = nums1[i];
            else{
                nums2[i] = nums1[i] - x;
            }
        }
    if(x==0) return true;
        for(int i=0;i<n;i++){
            if(nums2[i]%2==0) return false;
        }
        return true;
    }
}