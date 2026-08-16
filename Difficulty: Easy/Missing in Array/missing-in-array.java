class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
        long target = n*(n+1)/2;
        long sum = 0;
        
        for(int num : arr){
            sum += num;
        }
        return (int)(target-sum);
    }
}