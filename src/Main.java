public class Main {
    public static void main(String[] args) {

        int check = 100;
        int replenishment = 2000;
        int bonus;
        int threshold = 1000;

        if (replenishment > threshold) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println(check + replenishment + bonus);
        System.out.println(bonus);
    }
}