class Solution {
    public boolean divisibleBy5(String n) {
        // code here
        char lastChar = n.charAt(n.length()-1);
        if(lastChar == '0' || lastChar == '5'){
            return true;
        }
        else{
            return false;
        }
        
    }
};