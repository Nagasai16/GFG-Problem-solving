class Solution {
    public long product(long arr[]) {
        // code here
        long product = 1;
        long mod = 1000000007;
      for(int i=0;i<arr.length;i++){
          product = (product * arr[i])%mod;
      }  
      return product;

    }
}