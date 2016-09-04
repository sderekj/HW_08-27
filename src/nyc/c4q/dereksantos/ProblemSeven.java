package nyc.c4q.dereksantos;

public class ProblemSeven {

    // Q7. string-elide
        public static void main(String[] args) {

            elide("Hello"); // returns "Hello!"
            elide("Hello, world!"); // returns "Hel...!"
            elide("That's not my name."); // returns "Tha...."

        }

        public static void elide(String input) {

            String ellipsis = input.substring(0,3) + "..." + input.charAt(input.length()-1);

            if (input.length() < ellipsis.length()) {
                System.out.println(input);
            } else {
                System.out.println(ellipsis);
            }
        }
}

