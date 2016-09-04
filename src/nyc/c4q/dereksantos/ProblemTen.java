package nyc.c4q.dereksantos;

public class ProblemTen {

    public static void main(String[] args) {

        System.out.println(vowelCount("test string")); // return 2
        System.out.println(vowelCount("longer string with more vowels")); // return 8
        System.out.println(vowelCount("aeiouy")); // return 5, y is not counted

    }

    public static int vowelCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) == 'a' || input.toLowerCase().charAt(i) == 'e' || input.toLowerCase().charAt(i) == 'i' || input.toLowerCase().charAt(i) == 'o' || input.toLowerCase().charAt(i) == 'u') {
                count = count + 1;
            }
        }
        return count;
    }
}
