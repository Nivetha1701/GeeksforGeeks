class Solution {
    public int findUnique(int k, int[] arr) {
        int result = 0;

        // Iterate through each bit position (0 to 31)
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            
            // Count how many numbers have the i-th bit set
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    sum++;
                }
            }

            // If sum % k != 0, then the unique element has this bit set
            if (sum % k != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
