public class CreditPaymentService {
    public int calculate (double sum, double creditRate, int period) {
        int month = period * 12; // Период в месяцах
        double creditRate1 = creditRate / 12 / 100; // Месячная процентная ставка
        return (int) (sum * creditRate1 * Math.pow((1 + creditRate1), month) / (Math.pow((1 + creditRate1), month) - 1));
    }
}