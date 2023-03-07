public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int account = 100;
        int refill = 1500;
        int result = (account + refill);
        int bonus = (refill / 100);

        if (refill >= 1000) {
            System.out.println(" Итоговый счет " + (bonus + result));
            System.out.println(" Бонусные рубли " + bonus);
        } else {
            System.out.println(" Итоговый счет " + result);
        }

    }
}