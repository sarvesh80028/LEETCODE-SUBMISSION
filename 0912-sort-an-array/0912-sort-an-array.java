class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums);
        return nums;
    }
    public void mergesort(int[]nums){
        int n = nums.length;
        if(n==1) return;
        int[]a = new int[n/2];
        int[]b = new int[n-n/2];
        for(int i=0;i<a.length;i++) a[i] = nums[i];
        for(int j=0;j<b.length;j++) b[j] = nums[(n/2)+j];
        mergesort(a);
        mergesort(b);
        merge(nums,a,b);
    }
    public void merge(int[]nums,int[]a,int[]b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
            nums[k++] = a[i++];
        }
        else{
            nums[k++] = b[j++];
            }
        }
        while(i<a.length) nums[k++] = a[i++];
        while(j<b.length) nums[k++] = b[j++];
    }
}