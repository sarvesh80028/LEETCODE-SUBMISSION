class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int i=0;
        int j=0;
        int n=nums.size();
        int count=0;
        int zero=0;
        int ln=INT_MIN;
        while(j<n){
            if(nums[j]==1) count++;
            else zero++;
            if(zero<=k){
                ln=max(ln,j-i+1);
            }
            while(zero>k){
               if(nums[i]==1) {
                count--;
                i++;
               }
                else{
                    zero--;
                    i++;
                    break;
                }
            }
            j++;
        }
        if(ln==INT_MIN) return 0;
        return ln;
    }
};