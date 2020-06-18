import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        CreditPayment  service = new  CreditPayment();
        int payment12 = service.calculate(12,9.99);
        System.out.println(payment12);

        int payment24 = service.calculate(24,9.99);
        System.out.println(payment24);

        int payment36 = service.calculate(36,9.99);
        System.out.println(payment36);

    }

}
