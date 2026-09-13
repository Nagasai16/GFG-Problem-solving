class Solution {
    public int termOfGP(int a, int b, int n) {
        // code here
      if(n == 1){
          return a;
      }
      double r = (double) b/a;
      double ans = a * Math.pow(r,n-1);
      return (int) Math.floor(ans);
    }
};