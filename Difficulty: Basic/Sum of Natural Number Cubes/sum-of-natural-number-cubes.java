class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i*i*i;
        }
        return sum;
    }
}