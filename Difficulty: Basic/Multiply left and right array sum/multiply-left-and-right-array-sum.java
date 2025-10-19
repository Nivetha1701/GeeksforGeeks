// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        int n = arr.length;
        int mid = n / 2; // integer division

        int sumLeft = 0, sumRight = 0;

        for (int i = 0; i < n; i++) {
            if (i < mid) {
                sumLeft += arr[i];
            } else {
                sumRight += arr[i];
            }
        }

        return sumLeft * sumRight;
    }
}
