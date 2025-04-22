public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 9.99, 1) + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 9.99, 2) + " руб.");

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 9.99, 3) + " руб.");
    }
}