import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        int right_res = a >> b;
        int left_res = a << b;
        System.out.print(right_res + " " + left_res);
    }
}