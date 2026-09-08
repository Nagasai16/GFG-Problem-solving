class Solution {
    public int lcm(int a, int b) {
        // code here
        int orgA = a;
        int orgB = b;
        
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        int gcd = a;
        return (orgA/gcd) * orgB;
    }
}