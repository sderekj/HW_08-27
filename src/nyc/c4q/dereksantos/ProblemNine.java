package nyc.c4q.dereksantos;


public class ProblemNine {
    public static void main(String[] args) {

        System.out.println(decode("aaacodebbb")); // return 1
        System.out.println(decode("codexxcode")); // return 2
        System.out.println(decode("cozexxcope")); // return 2
        System.out.println(decode("cOkecoWECoMECOBecODecOde")); // return 6

    }

    public static int decode(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) == 'c' && input.toLowerCase().charAt(i + 1) == 'o' && input.toLowerCase().charAt(i + 3) == 'e') {
                count = count + 1;
            }
        }
        return count;
    }

}
