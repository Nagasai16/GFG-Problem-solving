class Solution {
    public int mean(int[] arr) {
        // code here
        long sum = 0;
        for(int num:arr){
            sum += num;
        }
        return (int) (sum/arr.length);
    }

    public int median(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2 != 0){
            return arr[n/2];
        }
        else{
            return (arr[(n/2)-1]+ arr[n/2])/2;
        }
        
    }
}