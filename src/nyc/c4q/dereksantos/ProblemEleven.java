package nyc.c4q.dereksantos;

public class ProblemEleven {

    public static void main(String[] args) {

        subStrAfterChars("this is a test string", 'a'); // returns " test string"
        subStrAfterChars("this is another test", 'o'); // returns "ther test"

    }

    public static void subStrAfterChars(String sentence, char letter) {

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.toLowerCase().charAt(i) == letter) {
                System.out.println(sentence.substring(i + 1,sentence.length()));
            }
        }
    }
}
