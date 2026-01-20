class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int target = nums.get(i);
            int best = -1;

            // brute-force smallest x
            for (int x = 0; x <= target; x++) {
                if ((x | (x + 1)) == target) {
                    best = x;
                    break;
                }
            }
            ans[i] = best;
        }
        return ans;

    }
}
