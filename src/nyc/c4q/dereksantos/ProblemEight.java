package nyc.c4q.dereksantos;


public class ProblemEight {

    public static void main(String[] args) {

        hashTag();

    }

    public static void hashTag() {

        for (int i = 6; i >= 0; i--) {
            int j = i;
            while (j < 7) {
                System.out.print("#");
                j++;
            }
            System.out.print("\n");
        }
    }
}
