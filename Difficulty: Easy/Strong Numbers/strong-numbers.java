class Solution {
    public boolean isStrong(int n) {
        // code here
        int temp = n;
        int sum = 0;
        while(temp > 0){
           int digit = temp%10;
            temp = temp/10;
            int fact =1;
            for(int i=1;i<=digit;i++){
                fact = fact * i;
             
            }
            sum += fact;
        }
        return sum == n;
        
    }
}