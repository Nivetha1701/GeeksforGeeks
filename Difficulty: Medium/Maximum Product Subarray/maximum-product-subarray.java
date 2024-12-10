//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int maxProduct = Integer.MIN_VALUE;

        int prefixProduct = 1;
        int suffixProduct = 1;

        // Traverse from left to right for prefix product
        for (int i = 0; i < n; i++) {
            prefixProduct *= arr[i];
            maxProduct = Math.max(maxProduct, prefixProduct);

            // Reset prefixProduct to 1 if it becomes 0
            if (prefixProduct == 0) {
                prefixProduct = 1;
            }
        }

        // Traverse from right to left for suffix product
        for (int i = n - 1; i >= 0; i--) {
            suffixProduct *= arr[i];
            maxProduct = Math.max(maxProduct, suffixProduct);

            // Reset suffixProduct to 1 if it becomes 0
            if (suffixProduct == 0) {
                suffixProduct = 1;
            }
        }

        return maxProduct;
    }
}
