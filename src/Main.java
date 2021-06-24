public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = service.calculate(1_000_000, 12);
        System.out.println("Ежемесячный платеж составляет " + monthlyPaymentOneYear);

        int monthlyPaymentTwoYears = service.calculate(1_000_000, 24);
        System.out.println("Ежемесячный платеж составляет " + monthlyPaymentTwoYears);

        int monthlyPaymentThreeYears = service.calculate(1_000_000, 36);
        System.out.println("Ежемесячный платеж составляет " + monthlyPaymentThreeYears);



    }
}
