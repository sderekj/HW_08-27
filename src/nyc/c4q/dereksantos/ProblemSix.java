package nyc.c4q.dereksantos;

import java.util.Scanner;

public class ProblemSix {

    // Q6. scanner-hungry-hippos

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a food: ");
            String input = scanner.next();
            startsWithH(input);
        }

        public static void startsWithH(String input) {

            for (int i = 0; i == 0; i++) {
                if (input.toLowerCase().charAt(i) == 'h') {
                    System.out.println("Yum!");
                } else {
                    System.out.println("Yuck!");
                }
            }
    }
}