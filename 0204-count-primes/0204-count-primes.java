class Solution {
    public int countPrimes(int n) {
        int count = 0;
        int[] s = seive(n);
        for (int i = 1; i < n; i++) {
            if (s[i] == 1)
                count++;
        }
        return count;
    }

    public int[] seive(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1);
        arr[0] = 0;
        if (arr.length > 1)
            arr[1] = 0;
        if (arr.length > 2) {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (arr[i] == 1) {
                    for (int j = i * i; j < n; j += i) {
                        arr[j] = 0;
                    }
                }
            }
        }
        return arr;
    }
}