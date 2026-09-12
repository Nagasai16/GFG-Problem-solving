class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1;(long) i*i <= n;i++){
            if(n%i==0){
                divisors.add(i);
            }
        }
        for(int i = (int) Math.sqrt(n); i>= 1;i--){
            if(n%i==0){
                int pair = n/i;
                if(pair != i){
                    divisors.add(pair);
                }
            }
        }
        return divisors;
    }
}