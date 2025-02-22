//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int cost=0;
        for(int i=0;i<N;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            int curr=a+b;
            cost+=curr;
            pq.add(curr);
        }
        return cost;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends