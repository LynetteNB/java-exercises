//You have to build a pyramid.
//
//This pyramid should be built from characters from a given string.
//
//You have to create the code for these four methods:
//
//The first method ("FromTheSide") shows the pyramid as you would see from the side.
//The second method ("FromAbove") shows the pyramid as you would see from above.
//The third method ("CountVisibleCharacters") should return the count of all characters, that are visible from outside the pyramid.
//The forth method ("CountAllCharacters") should count all characters of the pyramid. Consider that the pyramid is completely solid and has no holes or rooms in it.
//
//Every character will be used for building one layer of the pyramid. So the length of the given string will be the height of the pyramid. Every layer will be built with stones from the given character. There is no limit of stones.
//The pyramid should have perfect angles of 45 degrees.
//
//Example: Given string: "abc"
//
//Pyramid from the side:
//
//   c
//  bbb
// aaaaa
//Pyramid from above:
//
//aaaaa
//abbba
//abcba
//abbba
//aaaaa
//Count of visible stones/characters:
//
//25
//Count of all used stones/characters:
//
//35
//
//There is no meaning in the order or the choice of the characters. It should work the same for example "aaaaa" or "54321".
//Hint: Your output for the side must always be a rectangle! So spaces at the end of a line must not be deleted or trimmed!
//If the string is null or empty, you should exactly return this value for the watch-methods and -1 for the count-methods.


public class Pyramid {

    public static void main(String[] args) {
        System.out.println(watchPyramidFromTheSide("abc"));
    }

    public static String watchPyramidFromTheSide(String characters) {
        StringBuilder pyramidString = new StringBuilder();
        int length = characters.length() - 1;
        for(int i = length, j = 1; i >= 0; i--, j++) {
            pyramidString.append(leftSpaces(i) + baseString(characters.charAt(i), baseLength(j))+ "\n");
        }
        return pyramidString.toString();
    }

    public static String watchPyramidFromAbove(String characters) {
        return "";
    }

    public static int countVisibleCharactersOfThePyramid(String characters) {
        return 0;
    }

    public static int countAllCharactersOfThePyramid(String characters) {
        return 0;
    }

    private static int baseLength(int num){
        if(num == 1) {
            return 1;
        }

        return 2 + baseLength(num-1);
    }

    private static String baseString(char letter, int num) {
        StringBuilder base = new StringBuilder();
        for(int i = 0; i < num; i++) {
            base.append(letter);
        }
        return base.toString();
    }

    private static String leftSpaces(int level) {
        StringBuilder spaces = new StringBuilder();
        for(int i = 0; i < level; i++) {
            spaces.append(" ");
        }
        return spaces.toString();
    }
}
