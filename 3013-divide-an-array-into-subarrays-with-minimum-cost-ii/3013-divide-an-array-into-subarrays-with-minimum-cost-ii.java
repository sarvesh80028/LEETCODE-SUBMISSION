class Solution {

    class Node implements Comparable<Node> {
        int val, idx;

        Node(int v, int i) {
            val = v;
            idx = i;
        }

        public int compareTo(Node o) {
            if (val != o.val)
                return val - o.val;
            return idx - o.idx;
        }
    }

    public long minimumCost(int[] nums, int k, int dist) {

        if (k == 1)
            return nums[0];

        TreeSet<Node> small = new TreeSet<>();
        TreeSet<Node> large = new TreeSet<>();

        long sum = 0;
        long ans = Long.MAX_VALUE;

        int need = k - 1;

        for (int i = 1; i <= Math.min(nums.length - 1, dist + 1); i++) {
            Node cur = new Node(nums[i], i);

            small.add(cur);
            sum += cur.val;

            if (small.size() > need) {
                Node x = small.pollLast();
                sum -= x.val;
                large.add(x);
            }
        }

        if (small.size() == need)
            ans = sum;

        for (int l = 2; l < nums.length; l++) {

            Node rem = new Node(nums[l - 1], l - 1);

            if (small.remove(rem)) {
                sum -= rem.val;
            } else {
                large.remove(rem);
            }

            int addIdx = l + dist;

            if (addIdx < nums.length) {
                Node add = new Node(nums[addIdx], addIdx);

                if (!small.isEmpty() && add.compareTo(small.last()) < 0) {
                    small.add(add);
                    sum += add.val;

                    if (small.size() > need) {
                        Node x = small.pollLast();
                        sum -= x.val;
                        large.add(x);
                    }
                } else {
                    large.add(add);
                }
            }

            while (small.size() < need && !large.isEmpty()) {
                Node x = large.pollFirst();
                small.add(x);
                sum += x.val;
            }

            while (!large.isEmpty() && !small.isEmpty()
                    && large.first().compareTo(small.last()) < 0) {

                Node a = small.pollLast();
                Node b = large.pollFirst();

                sum -= a.val;
                sum += b.val;

                small.add(b);
                large.add(a);
            }

            if (small.size() == need)
                ans = Math.min(ans, sum);
        }

        return ans + nums[0];
    }
}