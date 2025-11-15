class Solution {
    public int findMaxSum(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int take = 0; // max if we loot current
        int skip = 0; // max if we skip current

        for (int money : arr) {
            int newTake = skip + money;   // must have skipped previous
            int newSkip = Math.max(skip, take); // best of previous choices

            take = newTake;
            skip = newSkip;
        }

        return Math.max(take, skip);
    }
}
