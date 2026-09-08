class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int orgA = a;
        int orgB = b;
        int[] result = new int[2];
        
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        int gcd = a;
        int lcm = (orgA/gcd) * orgB;
        result[0] = lcm;
        result[1] = gcd;
        return result;
    }
}