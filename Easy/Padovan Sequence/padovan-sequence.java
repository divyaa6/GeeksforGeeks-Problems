//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


class Solution
{
    int padovanSequence(int n)
    {
       //code here
       int mod=1000000007;
       int p0=1,p1=1,p2=1;
       if(n<=2) return 1;
       for(int i=3;i<=n;i++){
           int p3 = (p0 + p1)%mod;
           p0 = p1;
           p1 = p2;
           p2 = p3;
       }
       return p2;
    }
};


