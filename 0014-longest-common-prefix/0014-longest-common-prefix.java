class Solution {
    public String longestCommonPrefix(String[] s) {

        int n = s.length;
        int maxlen = s[0].length();

        ArrayList<Character> arr = new ArrayList<>();
        for (int j = 0; j < s[0].length(); j++) {
            arr.add(s[0].charAt(j));
        }

        for (int i = 1; i < n; i++) {

            String strs = s[i];
            int len = 0;

            for (int j = 0; j < strs.length() && j < arr.size(); j++) {

                if (strs.charAt(j) == arr.get(j)) {
                    len++;
                } else {
                    break;
                }
            }
            maxlen = Math.min(maxlen, len);
        }

        StringBuilder ans = new StringBuilder();

        for (int k = 0; k < maxlen; k++) {
            ans.append(arr.get(k));
        }

        return ans.toString();
    }
}