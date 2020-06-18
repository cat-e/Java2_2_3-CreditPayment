public class CreditPayment<payment> {

    public int calculate(int month, double percent) {
        int amountCredit = 1_000_000;
        double interestRate = percent / 100 / 12;
        int payment = (int) (amountCredit * (interestRate + (interestRate / (Math.pow((1 + interestRate), month) - 1))));
        return payment;
    }

}
