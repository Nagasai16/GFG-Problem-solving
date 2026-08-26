class Solution {
    public int convertFive(int n) {
        // code here
        String s = Integer.toString(n);
        s = s.replace('0','5');
         return Integer.parseInt(s);
    }
   
}