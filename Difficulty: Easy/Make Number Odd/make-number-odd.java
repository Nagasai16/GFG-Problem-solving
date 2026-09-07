class Solution {
    public int makeNumberOdd(int n) {
        // Code here
        return n & (-n);
    }
}