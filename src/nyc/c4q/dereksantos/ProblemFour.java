package nyc.c4q.dereksantos;

/**
 * Write a Java method that takes a string as a parameter and returns true if it ends in "ly".
 */
public class ProblemFour {
    public static void main(String[] args) {

        System.out.println(endsly("really"));
    }

    public static boolean endsly(String input) {
        return input.endsWith("ly");
    }

}
