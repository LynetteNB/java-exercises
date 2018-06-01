public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("asdffdsa"));
    }

//    private static boolean isPalindrome(String x) {
//        char[] xArray = x.toLowerCase().toCharArray();
//        for(int i = 0; i < xArray.length/2; i++) {
//            if(xArray[i] != xArray[xArray.length-i-1]) {
//                return false;
//            }
//        }
//        return true;
//    }

    private static boolean isPalindrome(String x) {
        return new StringBuilder(x).reverse().toString().equals(new StringBuilder(x).toString());
    }
}
