class Solution {
    public int numberOfSquares(int base) {
        // Code here
        int m = (base - 2)/2;
        if(m <= 0){
            return 0;
        }
        return m*(m+1)/2;
    }
}