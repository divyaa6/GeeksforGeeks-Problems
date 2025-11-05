class Solution {
    static boolean isPerfect(int n) {
        // code here
        long s=1;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                s+=i;
                if(i!=(n/i))
                s+=n/i;
            }
            
        }
        return n==s;
        
    }
};