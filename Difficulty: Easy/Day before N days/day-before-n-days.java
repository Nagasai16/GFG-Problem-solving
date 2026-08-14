class Solution {
    public int dayBefore(int d, int n) {
        // code here
        int shift = n%7;
        return (d-shift+7) % 7;
        
    }
}