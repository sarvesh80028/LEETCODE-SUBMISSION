class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                arr.add(s.charAt(j)-'0');
            }
        }
        int[]a = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i] = arr.get(i);
        }
        return a;
    }
}