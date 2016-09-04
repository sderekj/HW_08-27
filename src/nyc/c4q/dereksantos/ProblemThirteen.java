package nyc.c4q.dereksantos;

import java.util.Scanner;
import java.lang.Math;

public class ProblemThirteen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our ice cream service! What's your name?: ");
        String name = scanner.next();


        System.out.println("Okay " + name + ", which flavor of ice cream would you like?");
        String flavor = scanner.next();


        System.out.println("Would you like chocolate chips?");
        String topping1 = scanner.next();


        System.out.println("Would you like bananas?");
        String topping2 = scanner.next();


        System.out.println("Would you like gummy bears?");
        String topping3 = scanner.next();

        int toppingCount = 0;
        if (topping1.equalsIgnoreCase("yes")) {
            toppingCount = toppingCount + 1;
        }
        if (topping2.equalsIgnoreCase("yes")) {
            toppingCount = toppingCount + 1;
        }
        if (topping3.equalsIgnoreCase("yes")) {
            toppingCount = toppingCount + 1;
        }

        int totalIntPrice = 233 + (toppingCount * 33);
        double totalPrice = (totalIntPrice/100d);

        double time = Math.random() * 60;

        int deliveryTime = (int)Math.ceil(time);


        System.out.println("Okay! A " + flavor + " ice cream with " + toppingCount + " toppings. Your total is " + "$" + totalPrice + " and will take " + deliveryTime + " minutes.");

    }
}
