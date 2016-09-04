package nyc.c4q.dereksantos;

public class ProblemTwelve {

    public static void main(String[] args) {

        twelveDays();

    }

    public static void twelveDays() {

        int daysOfChristmas = 12;

        for (int num = 1; num <= daysOfChristmas; num++) {

            String day = "someday";

            switch (num) {
                case 1:
                    day = "first";
                    break;
                case 2:
                    day = "second";
                    break;
                case 3:
                    day = "third";
                    break;
                case 4:
                    day = "fourth";
                    break;
                case 5:
                    day = "fifth";
                    break;
                case 6:
                    day = "sixth";
                    break;
                case 7:
                    day = "seventh";
                    break;
                case 8:
                    day = "eigth";
                    break;
                case 9:
                    day = "ninth";
                    break;
                case 10:
                    day = "tenth";
                    break;
                case 11:
                    day = "eleventh";
                    break;
                case 12:
                    day = "twelvth";
                    break;
            }

            System.out.println("On the " + day + " day of Christmas, my true love sent to me:");

            String present1 = "A Partridge in a Pear Tree\n";
            String present2 = " Turtle Doves\n";
            String present3 = " French hens\n";
            String present4 = " Calling Birds\n";
            String present5 = " Gold Rings\n";
            String present6 = " Geese a-laying\n";
            String present7 = " Swans a-swimming\n";
            String present8 = " Maids a-milking\n";
            String present9 = " Ladies Dancing\n";
            String present10 = " Lords a-leaping\n";
            String present11 = " Pipers piping\n";
            String present12 = " Drummers drumming\n";

            switch (num) {
                case 1:
                    System.out.println(present1);
                    break;
                case 2:
                    System.out.println(num + present2 + "and " + present1);
                    break;
                case 3:
                    System.out.println(num + present3 + (num - 1) + present2 + "and " + present1);
                    break;
                case 4:
                    System.out.println(num + present4 + (num - 1) + present3 + (num - 2) + present2 + "and " + present1);
                    break;
                case 5:
                    System.out.println(num + present5 + (num - 1) + present4 + (num - 2) + present3 + (num - 3) + present2 + "and " + present1);
                    break;
                case 6:
                    System.out.println(num + present6 + (num - 1) + present5 + (num - 2) + present4 + (num - 3) + present3 + (num - 4) + present2 + "and " + present1);
                    break;
                case 7:
                    System.out.println(num + present7 + (num - 1) + present6 + (num - 2) + present5 + (num - 3) + present4 + (num - 4) + present3 + (num - 5) + present2 + "and " + present1);
                    break;
                case 8:
                    System.out.println(num + present8 + (num - 1) + present7 + (num - 2) + present6 + (num - 3) + present5 + (num - 4) + present4 + (num - 5) + present3 + (num - 6) + present2 + "and " + present1);
                    break;
                case 9:
                    System.out.println(num + present9 + (num - 1) + present8 + (num - 2) + present7 + (num - 3) + present6 + (num - 4) + present5 + (num - 5) + present4 + (num - 6) + present3 + (num - 7) + present2 + "and " + present1);
                    break;
                case 10:
                    System.out.println(num + present10 + (num - 1) + present9 + (num - 2) + present8 + (num - 3) + present7 + (num - 4) + present6 + (num - 5) + present5 + (num - 6) + present4 + (num - 7) + present3 + (num - 8) + present2 + "and " + present1);
                    break;
                case 11:
                    System.out.println(num + present11 + (num - 1) + present10 + (num - 2) + present9 + (num - 3) + present8 + (num - 4) + present7 + (num - 5) + present6 + (num - 6) + present5 + (num - 7) + present4 + (num - 8) + present3 + (num - 9) + present2 + "and " + present1);
                    break;
                case 12:
                    System.out.println(num + present12 + (num - 1) + present11 + (num - 2) + present10 + (num - 3) + present9 + (num - 4) + present8 + (num - 5) + present7 + (num - 6) + present6 + (num - 7) + present5 + (num - 8) + present4 + (num - 9) + present3 + (num - 10) + present2 + "and " + present1);
                    break;
            }
        }
    }
}
