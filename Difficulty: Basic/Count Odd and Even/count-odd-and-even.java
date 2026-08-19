class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int Oddcount = 0;
        int Evencount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                Oddcount++;
            }
            else{
                Evencount++;
            }
        }
        return new int[]{Oddcount, Evencount};
        
    }
}