class Solution {
    public int minimumInteger(int[] arr) {
        // code here
        long s = 0;
        int n = arr.length;
        
        for(int x : arr){
            s += x;
        }
        int minX = Integer.MAX_VALUE;
        for(int x: arr){
            if((long) n * x >= s){
                minX = Math.min(minX, x);
            }
        }
        return minX;
    }
}