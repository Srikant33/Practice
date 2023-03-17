//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        
        List<Integer> l = new LinkedList<>();
        for (int i=0; i<n; i++){
            l.add(i);
        }
        Collections.sort(l, (a,b)-> arr[a]-arr[b]);
        
        for (int i: l){
            if (pq.isEmpty() || pq.peek()>=arr[i]){
                pq.add(dep[i]);
            }    
            else{
                pq.poll();
                pq.add(dep[i]);
            }
        }
        
        return pq.size();
    // add your code here
        
    }
    
}

