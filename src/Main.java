public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int refill = 1001;
        System.out.println(balance + refill);
        int bonus = 100;

        if (refill >= 1001) {
            System.out.println(refill / bonus);
        }

        if (refill < 1001) {
            System.out.println(bonus = 0);
        }
    }
}
