import java.util.*;
class Solution {
    static String toLower(String s) {
        return s.toLowerCase();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        toLower(input);
        sc.close();
    }
}
