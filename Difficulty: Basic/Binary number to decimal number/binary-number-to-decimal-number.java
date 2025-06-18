// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int ans=0;
        int base=1;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1')
            ans+=base;
            
            base*=2;
            
        }
        return ans;
        
    }
}