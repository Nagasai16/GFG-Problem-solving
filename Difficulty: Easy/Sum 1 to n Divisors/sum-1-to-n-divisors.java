class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        long totalSum = 0;
        for(int i=1;i<=n;i++){
            totalSum += (n/i)*i;
        }
        return totalSum;
    }
}