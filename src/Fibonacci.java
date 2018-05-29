public class Fibonacci {

    public static int fibNum(int n) {
        if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 1;
        }
        return fibNum(n-1) + fibNum(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibNum(7));
    }

}