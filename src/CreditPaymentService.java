public class CreditPaymentService {
    public int calculate (int creditAmount, int monthlyTerm) {
        double monthlyRate = 9.99 / 12/ 100;
        double coefficient = monthlyRate * Math.pow((1+monthlyRate), monthlyTerm) /(Math.pow((1+monthlyRate), monthlyTerm)-1);
        double monthlyPayment = coefficient * creditAmount;
        return (int) monthlyPayment;
    }
}
