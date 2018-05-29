import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("asdfe", "dsafe"));
    }

    private static boolean isAnagram(String x, String y) {
        char[] xArray = x.toLowerCase().toCharArray();
        char[] yArray = y.toLowerCase().toCharArray();
        Arrays.sort(xArray);
        Arrays.sort(yArray);
        return Arrays.equals(xArray, yArray);
    }
}
