package nyc.c4q.dereksantos;

/**
 * Check to see if a string has the same count of 'x's and 'o's.
 * The method must return a boolean and be case insensitive.
 * The string may contain any Unicode character -- not just 'x's and 'o's -- and may be of any length.
 */

public class ProblemThree {
    public static void main(String[] args) {

        System.out.println(sameXo("ooxx"));
        System.out.println(sameXo("xooxx"));
        System.out.println(sameXo("ooxXm"));
        System.out.println(sameXo("zpzpzpp"));
        System.out.println(sameXo("zzoo"));

    }

    public static boolean sameXo(String xo) {
//        boolean isSameCount = false;
        int totalX = 0;
        int totalO = 0;

        for (int i = 0; i < xo.length(); i++) {

            if (Character.toLowerCase(xo.charAt(i)) == 'x') {
                totalX++;
            }

            if (Character.toLowerCase(xo.charAt(i)) == 'o') {
                totalO++;
            }
        }

//        if (totalX == totalO) {
//            isSameCount = true;
//        }
//
//        return isSameCount;

        return totalX == totalO;
    }
}
