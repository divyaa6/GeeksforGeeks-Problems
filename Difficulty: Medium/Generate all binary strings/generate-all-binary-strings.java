// User function Template for Java

class Solution {
    public static void solve(int n,String curr,String last,List<String> arr){
        if(curr.length()==n){
            arr.add(curr);
            return;
        }
        if(last=="0"){
            solve(n,curr+"0","0",arr);
            solve(n,curr+"1","1",arr);
        }
        else{
            solve(n,curr+"0","0",arr);
        }
    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> arr=new ArrayList<>();
        solve(n,"","0",arr);
        return arr;
    }
}
