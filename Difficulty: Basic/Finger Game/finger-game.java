class Solution {
    public int findFinger(int n) {
        // code here
        int rem = n%8;
        if(rem==1){
            return 1;
        }
        if(rem==5){
            return 5;
        }
        if(rem==0||rem==2){
            return 2;
        }
        if(rem==3 || rem==7){
            return 3;
        }
        return 4;
        
    }
}