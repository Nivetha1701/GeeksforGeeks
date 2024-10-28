//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int n=arr.length;
        int ans[]=new int[n];
        int j=0;
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!set.contains(arr[i]))
            {
                set.add(arr[i]);
                ans[j++]=arr[i];
                count++;
            }
        }
        
        Arrays.sort(ans);
        if(count<2)
        {
            return -1;
        }
        return ans[ans.length-2];
    }
}